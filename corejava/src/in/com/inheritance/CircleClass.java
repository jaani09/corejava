package in.com.inheritance;

public class CircleClass extends ShapeClass {
	public int radius=0;
	public double PI=3.14;
	public void setRadius (int radius) {
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	public double area () {
		double cArea=PI*getRadius()*getRadius();
		System.out.println("circle area" + cArea);
		return cArea;
	}

}
