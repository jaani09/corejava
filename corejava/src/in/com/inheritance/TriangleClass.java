package in.com.inheritance;


public class TriangleClass extends ShapeClass { 

	private int height=0;
	private int base= 0;
	
	public void setHeight(int height) {
		this.height=height;
	}
	public int getHeight() {
		return height ;
	}
	public void setBase(int base){
		this.base=base; 
	}
		public int getBase() {
			return base;
		}
		public double area(){
			int tArea = (getHeight()*getBase())/2;
			System.out.println("triangle area= "+tArea);
			return tArea;
		}
	}


