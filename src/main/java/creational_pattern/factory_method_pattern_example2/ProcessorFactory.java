package creational_pattern.factory_method_pattern_example2;

public class ProcessorFactory {

	String name;
	
	private Processor processor;
	
	public ProcessorFactory(String name) {
		
		this.name=name;
		
	}
		
	public Processor getProcessor()
	{
		if(name.equalsIgnoreCase("Low"))
		{
			processor=new LowProcess();
		}	
		else if(name.equalsIgnoreCase("High"))
		{
		    processor=new HighProcess();
		} 
		
		return processor;
	}
	
}

