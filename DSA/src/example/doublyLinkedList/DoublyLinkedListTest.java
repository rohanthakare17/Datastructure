package example.doublyLinkedList;

public class DoublyLinkedListTest {
	//reverse is possible means isme return yeta yeil
	public static void main(String[] args) {
	
		MySong ms1= new MySong("My Heart Will Go On","Titanic","Celine D",1997);
		MySong ms2= new MySong("Zinghat","Sairat","Ajay Atul",2016);
		MySong ms3= new MySong("Kesariya","Bhramasra","Arjit Shingh",2022);
		MySong ms4 = new MySong("Tanhayee","Dil Chahta Hai","Sonu Nigam",2001);
		MySong ms5 = new MySong("Tadipar","Tadipar","MC",2020);
		MySong ms6 = new MySong("Just do it","CDAC YCP","MySelf",2022);
		
		DoublyLinkedList dllList = new DoublyLinkedList();
		
		dllList.showAllSong();
		
		dllList.addSong(ms1);
		dllList.addSong(ms2);
		dllList.addSong(ms3);
		dllList.addSong(ms4);
		dllList.addSong(ms5);
		
		dllList.showAllSong();
		
		dllList.addAtBeginning(ms6);
		
		dllList.showAllSong();
}

	
}
