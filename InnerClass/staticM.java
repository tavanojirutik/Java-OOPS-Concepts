package InnerClass;
//static class
	class mys{
		static int x=10;
		int y=0;
		
		static class demos{
			public void get() {
				System.out.println(x);  //Static Class only access The Static Method
			}
		}
	}

public class staticM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mys.demos d=new mys.demos();
		d.get();
		
	}

}
