package InnerClass;

	class outer{
		static int x=10;
		inner i=new inner();    //Globally Define
		
		class inner{
			int y=2;
			
			public void innerDrive() {
				System.out.println(x+" "+y);
			}
		}
		
		public void outer() {
//			inner i=new inner();    //Locally Define		
			i.innerDrive();
			System.out.println(i.y);
		}
	}


public class InnerDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		outer o=new outer();
//		o.outer();
		
		outer.inner io=new outer().new inner();
		io.innerDrive();
	}

}
