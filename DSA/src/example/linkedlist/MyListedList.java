package example.linkedlist;

public class MyListedList {
	
	Kite start;
	Kite ptr,prev;
	boolean found;
	
	void showList() {
		if(start==null) {
			System.out.println("List is empty");
		}
		else {
			System.out.println("List is not empty");
			ptr=start;
			while(ptr!=null) {
				System.out.println("DATA: "+ptr);
				ptr=ptr.next;
			}
		}
	}
	
	void add(Kite newKite) {//add at end
		if(start==null) {
			System.out.println("Adding first node...");
			start=newKite;
		}
		else {
			System.out.println("Adding internal node..");
			ptr=start;
			while(ptr!=null) {
				prev=ptr;
				ptr=ptr.next;
			}
			prev.next=newKite;
			newKite.next=null;
		}
	}
	
	void addAtBeginning(Kite newKite) {//add at Beginning
		if(start!=null) {
			System.out.println("This kite is added at the beginning of the existing list of kites..");
			newKite.next= start;
		}
		else {
			System.out.println("Your the firts kite");
			start=newKite;
		}
		
	}
	
	void searchKiteByLength(int lengthToSearch) {
		 found=false;
		if(start==null) {
			System.out.println("List is empty...nothing to search");
		}
		else {
			System.out.println("List is not empty...Searching");
			ptr=start;
			while(ptr!=null) {
				if(ptr.getLength()==lengthToSearch) {
					System.out.println("Kite Found: "+ptr);
					found=true;
					break;
				}
				ptr=ptr.next;
			}
		 if(found!=true) {
			 System.out.println("Kite is not found...of this lenght: "+lengthToSearch);
				
			}
			
		}
		
	}
	
	void deleteNodeByOwner(String ownerName) {
		found=false;
		if(start==null) {
			System.out.println("List is empty...nothing to delete");
		}
		else if(start.getOwner().equals(ownerName)) {
			
		}
	}
	
	void insertKite(String ownerToFind, Kite newKite) {//its like add in between
		
		if(start==null) {
			
			System.out.println("List is empty...cannot assigning this to list/ cannot add this object");
		}
		else {
			ptr=start;
			while(ptr!=null) {
				if(ptr.getOwner().equals(ownerToFind)) {
					
				}
			}
		}
		
		
	}
	//Maintain the size of the linkedList,size++ wherever applicable
	//SIZE-- TOO
	//Add show count
}
