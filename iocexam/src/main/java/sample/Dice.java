package sample;

public class Dice {
	private int face;
	
	public Dice(int face) {
		this.face = face;
	}
	
	public Dice() {
		
	}
	
	public int getNumber() {
		return (int)(Math.random()*face)+1;
	}

	public void setFace(int face) {
		this.face = face;
	}
}
