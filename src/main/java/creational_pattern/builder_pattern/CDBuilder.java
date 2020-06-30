package creational_pattern.builder_pattern;

public class CDBuilder {
	public CDType buildSonyCD(){
		CDType cds=new CDType();
		cds.addItem(new Sony());
		return cds;
	}
	public CDType buildSamsungCD(){
		CDType cds=new CDType();
		cds.addItem(new Samsung());
		return cds;
	}
}
