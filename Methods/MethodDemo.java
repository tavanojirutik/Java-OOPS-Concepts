package Methods;

public class MethodDemo {
	
	static String College="SSJCET";
	
	//Static Method 
	public static void add(int a , int b) {
		int c= a+b;
		System.out.println("Adding : "+c);
	}
	
	public void data(String name,String add) {
		System.out.println("Name is : "+name);
		System.out.println("Address is : "+add);
	}
	
	public int mul(int x,int y) {
		int z= x*y;
		System.out.println("Multiplication : "+z);
		return z;
	}
	
	public float price(float d) {
		System.out.println("Price in Float : "+d);
		return (float) d;
	}
	//Static Methody
	public static void college(String College) {
		System.out.println("Static College Name Call : "+College);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo m = new MethodDemo();
		m.add(55, 10);
		m.data("Divine", "Tisari Manzil Andhiri 59");
		int s= m.mul(30, 30);
		float x = m.price((float) 45.2122);
		
		college(College);
		

	}

}
