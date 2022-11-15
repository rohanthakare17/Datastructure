package example.tree;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeTestChemical {

	public static void main(String[] args) {
		TreeSet<ChemicalElement> periodicTableSet= new TreeSet<ChemicalElement>();
		ChemicalElement gold = new ChemicalElement(79, "Gold", "Au", 196.97f);
		
		ChemicalElement silver = new ChemicalElement(47, "Silver", "Ag", 107.87f);
		ChemicalElement radium = new ChemicalElement(88, "Radium", "Ra", 226.03f);
		
		ChemicalElement calcium = new ChemicalElement(20, "Calcium", "Ca", 40.078f);
		ChemicalElement tin = new ChemicalElement(50, "Tin", "Sn", 118.711f);
		
		ChemicalElement lead = new ChemicalElement(82, "Lead", "Pb", 207.2f);
		ChemicalElement uranium = new ChemicalElement(92, "Uranium", "U", 238.02f);
		System.out.println("Container created...");
		System.out.println("Adding0th Value...");
		periodicTableSet.add(gold);
		System.out.println("Adding 1st Value...");
		periodicTableSet.add(silver);
		System.out.println("Adding 2nd Value...");
		periodicTableSet.add(radium);
		System.out.println("Adding 3rd Value...");
		periodicTableSet.add(calcium);
		System.out.println("Adding 4th Value...");
		periodicTableSet.add(tin);
		System.out.println("Adding 5th Value...");
		periodicTableSet.add(lead);
		System.out.println("Adding 6th Value...");
		periodicTableSet.add(uranium);
		
		Iterator<ChemicalElement> periodicTableIterator= periodicTableSet.iterator();
		System.out.println("Retrieved the iterator...");
		
		while(periodicTableIterator.hasNext()) {
			ChemicalElement theElement = periodicTableIterator.next();
			System.out.println("Element : "+theElement);
		}
				
	}

}
