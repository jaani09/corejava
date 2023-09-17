package in.com.inheritance;

final class RactangleClass extends ShapeClass{


		private int  length =0;
		private int width=0;
		
		public void setLength(int length) {
			this.length=length;
		}
		public int getLength() {
			return length;
		}
		public void setWidth(int width){
			this.width=width; 
		}
			public int getWidth() {
				return width;
			}
			public double area(){
				int rArea =getLength()*getWidth();
		System.out.println("rectangle area = " +rArea);
				return rArea;
			}
		
	}


