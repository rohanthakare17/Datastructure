package example.tree;

import java.util.Scanner;

public class MyTreeSet {
	
	ChemicalElement root=null, temp;
	
	
	//function to add
	void insert () {
		create();
		if(root==null) {
			root=temp;
		}
		else {
			search(root);
		}
	}
	
	
	void create() {
		System.out.println("Enter atomic number : ");
		Scanner sc = new Scanner(System.in);
		int tempAtomicNumber = sc.nextInt();
		
		temp= new ChemicalElement();
		temp.atomicNumber=tempAtomicNumber;
		
		temp.left=null;
		temp.right=null;
	}
	
	void search(ChemicalElement ce) {
		if((temp.atomicNumber >ce.atomicNumber) && (ce.right!=null)) {
			search(ce.right);
		}
		else if((temp.atomicNumber > ce.atomicNumber) && (ce.right==null)) {
			ce.left=temp;
		}
		
		else if((temp.atomicNumber < ce.atomicNumber) && (ce.left!=null)) {
			search(ce.left);
		}
		
		else if((temp.atomicNumber < ce.atomicNumber) && (ce.left==null)) {
			ce.left=temp;
		}
	}
	
	void inOrder(ChemicalElement ce) {
		if(root == null) {
			System.out.println("No elements to show in the tree ");
			return;
		}
		if(ce.left!=null)
			inOrder(ce.left);
		
		System.out.println("DATA :"+ce);
		
		if(ce.right!=null)
			inOrder(ce.right);
		
	}
}
