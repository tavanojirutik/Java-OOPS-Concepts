package Data_Hiding;

	class rect{
		private double length;
		private double breath;
		
		public double getLength() {
			return length;
		}
		
		public double setLength(double l) {
			if(l>0) {
				return l;
			}else 
				return 0;
		}
		
		public double getBreath() {
			return breath;
		}
		
		public double setBreath(double i) {
			return breath;
		}
		
		
		
		public double area() {
			return getBreath()*getLength();
		}
		
		 public double perimeter()
		    {
		        return 2*(length+breath);
		    }
		    
		    public boolean isSquare()
		    {
		        if(length==breath)
		            return true;
		        else 
		            return false;
		    }
	}


public class Rectangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rect r=new rect();
		r.setBreath(10.4);
		r.setLength(5.2);
		
		System.out.println("Area Of Rectangle is "+r.area());
		System.out.println("Perimeter "+r.perimeter());
        System.out.println("Is Square "+r.isSquare());
        System.out.println("Length "+r.getLength());
        System.out.println("Breadth "+r.getBreath());
		
	}

}
