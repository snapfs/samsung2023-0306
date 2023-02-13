package sample;

public class Dice {
	private int face;
	
	public int getNumber() {
		return (int)(Math.random()*face)+1;
	}
}
