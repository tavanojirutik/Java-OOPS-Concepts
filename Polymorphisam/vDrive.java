package Polymorphisam;

	class a{
		int a=10;
		static int r=3;
	}
	class b extends a{
		int a=9;
		static int r=5;
	}

public class vDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a x=new b();
		System.out.println(x.a);
		System.out.println(x.r);
	}

}

//Variable is used depend on Reference Type Does Not Depend on Object 
//Its Under Compile Polymorphisam