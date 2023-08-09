package Methods;

	// Main Method OverLoading

public class methodover {

	public static void main(String[] args) {
		
		main();
		main(10,20);
		main(100,"Rutik");
	}
	
	public static void main() {
		System.out.println(100+20);
	}
	
	public static void main(int i , int j) {
		System.out.println(i+j);
	}
	
	public static void main(int x,String y) {
		System.out.println("Number is :"+x+"\nName is : "+y);
	}
	
}
