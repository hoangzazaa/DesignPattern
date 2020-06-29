package creational_pattern.singleton_pattern;

/**
 *  creation of instance at load time.
 *  we create the instance of the class at the time of declaring the static data member,
 *  so instance of the class is created at the time of classloading.
 *  lần đầu gọi vào class này thì nó sẽ tạo (đéo biết đúng không nhưng nếu như này là sai)
 */
public class EarlyInstantiation {

	private static EarlyInstantiation earlyInstantiation = new EarlyInstantiation();

	private EarlyInstantiation() {
		
	}

	public static EarlyInstantiation getEarlyInstantiation() {
		return earlyInstantiation;
	}

	public void doSomething(){
		//write your code  
	}

}
