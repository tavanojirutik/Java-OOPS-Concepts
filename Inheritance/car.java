package Inheritance;
//Single Level Inheritance  (One Class Is Depend On Another Class)
	class vehical{
		protected String brand = "BMW";
		
		public void  vehical() {
			System.out.println("X1 , x2");
		}
	}
	
	class vehical2 extends vehical{
		String modal ="x5";
		
	}


public class car {

	public static void main(String[] args) {
	
		vehical2 v =new vehical2();
		v.vehical();
		System.out.println(v.brand+" "+v.modal);

	}

}
