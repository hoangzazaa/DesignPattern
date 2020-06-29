package creational_pattern.singleton_pattern;

import java.io.Serializable;

/**
 *  creation of instance when required.
 *  we create the instance of the class in synchronized method or synchronized block,
 *  so instance of the class is created when required.
 */
public class LazyInstantiation implements Serializable {
	private static LazyInstantiation lazyInstantiation;

	private LazyInstantiation() {
		
	}

	public static LazyInstantiation getLazyInstantiation() {
		if (lazyInstantiation == null) {
			synchronized (LazyInstantiation.class) {
				if (lazyInstantiation == null) {
					lazyInstantiation = new LazyInstantiation();
				}
			}
		}

		return lazyInstantiation;
	}

	public void doSomething(){
		//write your code  
	}

	/*
	* If singleton class is Serializable,
	 * you can serialize the singleton instance. 
	 * Once it is serialized, 
	 * you can deserialize it but it will not return the singleton object.
	 * To resolve this issue, you need to override the readResolve() method 
	 * that enforces the singleton. 
	 * It is called just after the object is deserialized. 
	 * It returns the singleton object.
	* */
	protected Object readResolve() {
		return getLazyInstantiation();
	}
}
