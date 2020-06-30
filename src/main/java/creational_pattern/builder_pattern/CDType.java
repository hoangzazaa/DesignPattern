package creational_pattern.builder_pattern;

import java.util.ArrayList;
import java.util.List;

public class CDType {
	private List<Packing> packings = new ArrayList<Packing>();
	
	public void addItem(Packing packs) {
		packings.add(packs);
	}
	
	public void getCost() {
		for (Packing packs : packings) {
			packs.price();
		}
	}
	
	public void showItems() {
		for (Packing packing : packings) {
			System.out.print("CD name : " + packing.pack());
			System.out.println(", Price : " + packing.price());
		}
	}
}
