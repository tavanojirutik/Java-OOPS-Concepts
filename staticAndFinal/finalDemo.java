package staticAndFinal;

	class fdemo{
		final static int MAX = 0;
		final float X=87;
		
		fdemo(){
			System.out.println(X);
		}
		
		static{
			System.out.println(MAX);
		}
		
	}

public class finalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fdemo f=new fdemo();
		
	}

}
