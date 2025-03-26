package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double height;
	private double width;
	private double Xposition;
	private double Yposition;
	private boolean filled;
	
	public Rectangle(double height, double width, double Xposition, double Yposition, boolean filled) {
		this.height = height;
		this.width = width;
		this.Xposition = Xposition;
		this.Yposition = Yposition;
		this.filled = filled;
	}
	public double area() {
		return width * height;
	}
	public double perimeter() {
		return 2*width + 2*height;
	}
	public void drawTheRectangle(){
		StdDraw.rectangle(Xposition, Yposition, width, height);
	}
	public boolean isSquare() {
		if (width==height) {
			return true;
		} else {
			return false;
		}
	}
	public void areaComparison(Rectangle other) {
		if(this.area()>other.area()) {
			System.out.print("greater than");
		} else if (this.area()<other.area()) {
			System.out.print("smaller than");
		} else {
			System.out.print("equal");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec1 = new Rectangle(.5,.3,.5,.5,false);
		rec1.drawTheRectangle();
		System.out.println(rec1.isSquare());
		Rectangle rec2 = new Rectangle(.4,.4,.5,.5,false);
		rec2.drawTheRectangle();
		System.out.println(rec2.isSquare());
		rec2.areaComparison(rec1);
	}

}
