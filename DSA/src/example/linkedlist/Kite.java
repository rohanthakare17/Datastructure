package example.linkedlist;

public class Kite {
	private String color;
	private String owner;
	private int length;
	private boolean flying;
	Kite next;
	
	
	
	public Kite(String color, String owner, int length, boolean flying) {
		super();
		this.color = color;
		this.owner = owner;
		this.length = length;
		this.flying = flying;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getOwner() {
		return owner;
	}



	public void setOwner(String owner) {
		this.owner = owner;
	}



	public int getLength() {
		return length;
	}



	public void setLength(int length) {
		this.length = length;
	}



	public boolean isFlying() {
		return flying;
	}



	public void setFlying(boolean flying) {
		this.flying = flying;
	}



	public Kite getNext() {
		return next;
	}



	public void setNext(Kite next) {
		this.next = next;
	}



	@Override
	public String toString() {
		return this.hashCode()+ " Kite [color=" + color + ", owner=" + owner + ", length=" + length + ", flying=" + flying + ", ]";
	}
	
	

}
