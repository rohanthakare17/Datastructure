package example.stackTest;

public class MyStack {
	int index =-1;
	int size;
	int array[];//just a reference to int array
	
	public MyStack(int size){
		System.out.println("MyStack created with "+size+" integers");
		this.size=size;
		array = new int[ size ]; //allocation of the ints
	}
	
	public void push(int item) {
		System.out.println("Pusing "+item+" to the stack..");
		//10 20 30 40 50 60
		//-1 0  1  2  3  4
		if(index>size-2)
			throw new MyStackOverflowExcption("Stack size is overflow");
		array [++index]=item;
	}
	
	public int pop() {
		System.out.println("Popping item from the stack..");
		if(index<0)
			throw new MyStackEmptyExcpetion("Stack is empty");
		return array[index--]; 
	}
	
	public int peek() {
		return array[index];
	}
}
