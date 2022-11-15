package example.queue;

public class MyQueue {
	int front=-1;
	int length;
	int index=-1;
	int array[];
	
	public MyQueue(int length){
		this.length=length;
		array = new int [length];
	}

	public void add(int item) {
		if(index>length-2)
			throw new MyQueueOverflowExcption("Queue size is full.");
		array [++index]=item;
		System.out.println("Added "+item+" at index "+index);
	}
	
	public int remove() {
		if(index-1<front)
			throw new MyQueueEmptyExcpetion("Rear reached..");
//		return array[length - index-- - 1];
		return array[++front];
		
	}
}
