package staticAndFinal;

	class ddrive{
		static int x;
		
		static {
			System.out.println(x=100);
		}
		
		static {
			System.out.println("Second Static Block");
		}
	}

public class Staticss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ddrive d=new ddrive();
	}

}
