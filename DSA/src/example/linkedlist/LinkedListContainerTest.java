package example.linkedlist;

public class LinkedListContainerTest {

	public static void main(String[] args) {
		
		Kite k1 =new Kite("Red","Jack",50,true);
		Kite k2 =new Kite("Green","Jane",60,true);
		Kite k3 =new Kite("Blue","John",80,true);
		Kite k4 =new Kite("Yello","Jim",90,true);
		Kite k5 =new Kite("Black","Julie",100,true);
		
		MyListedList myList= new MyListedList();
		
		myList.showList();
		
		myList.add(k1);
		myList.add(k2);
		myList.add(k3);
		myList.add(k4);
		myList.add(k5);
		
		myList.showList();
		
		System.out.println("==================");
	}

}
