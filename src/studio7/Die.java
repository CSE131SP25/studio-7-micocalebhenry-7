package studio7;

public class Die {

	private int NumSides;
	
	public Die(int NumSides) {
		this.NumSides = NumSides;
	}
	
	public int rollDie(){
		int value = (int) (Math.random( )* NumSides +1);
		return value; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die DND = new Die(20);
		System.out.println(DND.rollDie());
	}
	

}
