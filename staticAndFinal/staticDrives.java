package staticAndFinal;

	class test{
		static int x=10;
		int y=8;
		
		void get() {
			System.out.println(x+" "+y);
		}
		
		static void let() {
			System.out.println(x);
		}
	}

public class staticDrives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test t=new test();
		t.get();
		t.x=200;
		t.y=300;
		
		test f=new test();
		t.get();
		t.let();+
	}

}
