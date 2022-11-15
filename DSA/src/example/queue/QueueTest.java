package example.queue;

public class QueueTest {

	public static void main(String[] args) {
		MyQueue que = new MyQueue(5);
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
//		que.add(60);
		System.out.println("Remove "+que.remove()+" from Queue");
		System.out.println("Remove "+que.remove()+" from Queue");
		System.out.println("Remove "+que.remove()+" from Queue");
		System.out.println("Remove "+que.remove()+" from Queue");
		System.out.println("Remove "+que.remove()+" from Queue");
		System.out.println("Remove "+que.remove()+" from Queue");
	}	
}

class MyQueueOverflowExcption extends RuntimeException{
	MyQueueOverflowExcption(String str) {
		super(str);
	}
}

class MyQueueEmptyExcpetion extends RuntimeException{
	MyQueueEmptyExcpetion(String str) {
		super(str);
	}
}