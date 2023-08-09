package InnerClass;

	abstract class my{
		abstract public void get();
	}
	
	class demo{
		public void dis() {
			my m=new my() {
				public void get() {
					System.out.println("Abstract Class Method Call");
				}
			};
			m.get();
		}
	}

public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d=new demo();
		d.dis();
	}

}
