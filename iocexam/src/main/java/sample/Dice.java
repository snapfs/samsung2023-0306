package sample;

public class Dice {
	private int face;
	
	public Dice(int face) {
		this.face = face;
		System.out.println("Dice 생성자 실행!!");
	}
	
	public int getNumber() {
		return (int)(Math.random() * face) + 1; 
	}
}
