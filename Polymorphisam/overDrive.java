package Polymorphisam;
//Runtime Polymorphisam

	class superr
	{
		public void math1() {
			System.out.println("First Math1");
		}
		public void math2() {
			System.out.println("Second Math2");
		}
		public void math() {
			System.out.println("Super Default");   //Run Time Method Shadow
		}
	}
	
	class sub extends superr
	{
		public void math() {
			System.out.println("Sub Default");
		} 
		public void mathx() {
			System.out.println("mathx");
		}
	}

public class overDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superr s=new sub();
//		sub a=new superr();       //Not Allow 
		
		s.math();
		s.math1();
		s.math2();
//		s.mathx();  //Method Not Call (Its Out Of Superclass)

	}

}
