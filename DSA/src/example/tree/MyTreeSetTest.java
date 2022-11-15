package example.tree;

import java.util.Scanner;

public class MyTreeSetTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		ChemicalElement gold = new ChemicalElement(79, "Gold", "Au", 196.97f);
		ChemicalElement silver = new ChemicalElement(47, "Silver", "Ag", 107.87f);
		ChemicalElement radium = new ChemicalElement(88, "Radium", "Ra", 226.03f);
		
		ChemicalElement calcium = new ChemicalElement(20, "Calcium", "Ca", 40.078f);
		ChemicalElement tin = new ChemicalElement(50, "Tin", "Sn", 118.711f);
		
		ChemicalElement lead = new ChemicalElement(82, "Lead", "Pb", 207.2f);
		ChemicalElement uranium = new ChemicalElement(92, "Uranium", "U", 238.02f);
		
		MyTreeSet myTreeSet=new MyTreeSet();
		
		do {
			System.out.println("1. Insert an Element ");
			System.out.println("2. Delete an Element ");
			System.out.println("3. InOrder an Element ");
			System.out.println("4. PreOrder an Element ");
			System.out.println("5. PostOrder an Element ");
			System.out.println("6. Exit ");
			System.out.println("Enter choice : ");
			 choice=sc.nextInt();
			 
			 switch(choice) {
			 case 1: 
				 	myTreeSet.insert();
				 	break;
			 case 3: 
				 	myTreeSet.inOrder(myTreeSet.root);
				 	break;
				 	
			 case 6:
				 	break;
			 }
			
		} while(choice!=6);
		
//		gold.left=silver;
//		gold.left.left=calcium;
//		gold.left.right=tin;
//		
//		gold.right=radium;
//		gold.right.left=lead;
//		gold.right.right=uranium;
		
		

	}

}
