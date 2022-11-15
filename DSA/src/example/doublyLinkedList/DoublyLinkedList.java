package example.doublyLinkedList;

public class DoublyLinkedList {

	MySong start =null,ptr;
	boolean found;
	void addSong(MySong newSong) {
		if(start==null) {
			System.out.println("Juck box is empty");
			start=newSong;
			start.prev=null;
			start.next=null;
			System.out.println("Added the First Song.....");
		}
		
		else if (start.next==null) {
			start.next=newSong;
			newSong.prev=start;
			newSong.next=null;
			System.out.println("ADDED the Second Song");
		}
		else {
			ptr=start.next;//200
			while(ptr.next!=null) {
				ptr=ptr.next;
			}
		
		ptr.next=newSong;
		newSong.prev=ptr;
		newSong.next=null;
		System.out.println("ADDED the Internal Songs....");
		}
	}
	
	void showAllSong() {
		if(start==null) {
			System.out.println("Juck box is empty...");
		}
		else {
			ptr=start;
			while(ptr!=null) {
				System.out.println("DATA : "+ptr);
				System.out.println("------------------");
				ptr=ptr.next;
			}
		}
	}
	
	void insertNode(String titleToFind, MySong newSong ) {
		found=false;
		if(start==null) {
			System.out.println("List is empty...cannot add this object...");
		}
		
		else if(start.title.equals(titleToFind)) {
			addAtBeginning(newSong);
		}
		else {
			
		}
		
		
	}
	
	void addAtBeginning(MySong newSong) {
		if(start!=null) {
			System.out.println("This is added at beginning of the exiting list of Songs");
			newSong.next=start;
			start=newSong;
			start.prev=null;
		}
		else {
			System.out.println("This is 1st song...");
			start=newSong;
			start.prev=null;
		}
		
	}
	void deleteNodeByTitle(String titleName) {
		found=false;
		if(start==null) {
			System.out.println("List is empty...nothing is delete");
		}
		else {
			ptr=start;
			while(ptr!=null) {
				if(ptr.title.equals(titleName)) {
					System.out.println("\nSong found...Deleted song from the begining");
					ptr.prev.next=ptr.next;
					ptr.next.prev=ptr.prev;
					ptr.prev=null;
					ptr.next=null;
					System.out.println("Song is deleted...");
				}
				ptr=ptr.next;
			}
			
		}
		
		
	}
	
}