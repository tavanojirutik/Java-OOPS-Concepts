package Methods;
//Method Overloading 
public class ArathmaticOperation {
	
	public static int math(int a,int b) {
		int x=a+b;
		System.out.println("Addication : "+x);
		return x;
	}
	
	public  String math(String s) {
		System.out.println(s);
		return s;
	}
	
	public static void math(int a,double b) {
		int x=(int) (a*b);
		System.out.println("Multiplication : "+x);
		
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArathmaticOperation a=new ArathmaticOperation();
		int x=a.math(2,4);
		a.math("Jon");
		math(4,2.2);

		
		
	}

}
