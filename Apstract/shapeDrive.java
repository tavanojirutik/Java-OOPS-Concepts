package Apstract;

	abstract class shape{
		abstract public double perimeter();
		abstract public  double area();
	}
	
	class circle extends shape{
		double radius = 30;
		public double perimeter() {
			return 2*Math.PI*radius;
		}
		
		public double area() {
			return 2*Math.PI*radius*radius;
		}
	}
	
	class rectangle extends circle{
		double l=10;
		double b=7;
		public double perimeter() {
			return 4*(l*b);
		}
		public double area() {
			return l*b;
		}
	}

public class shapeDrive {

	public static void main(String[] args) {
		
		rectangle r=new rectangle();
		shape s=r;  //Polymorphisam Concept
		System.out.println(s.area());
		System.out.println(s.perimeter());
		
		System.out.println("________________");
		
		shape d=new circle();
		System.out.println(d.area());
		System.out.println(d.perimeter());
	}

}
