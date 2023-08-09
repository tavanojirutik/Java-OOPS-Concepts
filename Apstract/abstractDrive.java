package Apstract;

	abstract class first
	{
		void math() {
			System.out.println("First Method");
		}
		void math1() {
			System.out.println("Second Method");
		}
		
		abstract void abs();
	}

	class sec extends first
	{
		public void abs() {
			System.out.println("Abstaract Method");
		}
	}
public class abstractDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first f=new sec();
		f.abs();
		f.math();
		f.math1();
	}

}
