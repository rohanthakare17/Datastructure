package example.stackTest;

public class StackTest {

	public static void main(String[] args) {
		

		MyStack theStack = new MyStack(5);
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		theStack.push(50);
		//theStack.push(60);
		
		System.out.println("=> element of the top : "+theStack.peek());
		
		System.out.println(theStack.pop());
		System.out.println("=> element of the top : "+theStack.peek());
		
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		//System.out.println(theStack.pop());
	}
	
}	
	
class MyStackOverflowExcption extends RuntimeException{
	MyStackOverflowExcption(String str) {
		super(str);
	}
}

class MyStackEmptyExcpetion extends RuntimeException{
	MyStackEmptyExcpetion(String str) {
		super(str);
	}
}
