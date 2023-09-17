package in.com.inheritance;

public class ShapeClass {

	private int borderWidth=0;
	private String color=null;
	
	public void setBorderWidth(int borderwidth) {
		this.borderWidth=borderwidth;
	}
	public int getBorderwidth() {
		return borderWidth;
	}
	public void setColor (String Color){
		this.color=color; 
	}
		public String getcolor() {
			return color;
		}
		public double area(){
			System.out.println("this is area method ");
			return area();
		}
	}


	