package example.tree;

public class ChemicalElement implements Comparable<ChemicalElement>{
	int atomicNumber;
	String atomicName;
	String atomicFormula;
	float atomicMass;
	public ChemicalElement left;
	public ChemicalElement right;
	
	public ChemicalElement() {
		super();
		
	}
	public ChemicalElement(int atomicNumber, String atomicName, String atomicFormula, float atomicMass) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
		this.atomicMass = atomicMass;
	}
	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicFormula="
				+ atomicFormula + ", atomicMass=" + atomicMass + "]";
	}
//	@Override
//	public int compareTo(ChemicalElement firstElement) {
//		System.out.println("Compring "+atomicNumber+ "with "+firstElement.atomicNumber);
//		return Integer.compare(atomicNumber, firstElement.atomicNumber);
//	}
	@Override
	public int compareTo(ChemicalElement firstElement) {
		System.out.println("Compring "+atomicName+ " with "+firstElement.atomicName);
		return atomicName.compareTo(firstElement.atomicName);
	}

}
