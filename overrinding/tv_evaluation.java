package overrinding;

	class tv
	{
		 public void switchOn() {
			 System.out.println(" Old Tv is Switch On ");
		 }
		 public void Channel() {
			 System.out.println(" Old Tv Change Channel ");
		 }
	}
	
	class smartTv extends tv
	{
		public void switchOn() {
			 System.out.println(" Smart Tv is Switch On ");
		 }
		
	
		 public void Channel() {
			 System.out.println(" Smart Tv Change Channel ");
		 }
		
		 public void game() {
			 System.out.println(" We Can Play Game in Smart Tv ");
		 }
	}

public class tv_evaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tv t=new smartTv();
		smartTv x=(smartTv) t;
		x.Channel();
		x.switchOn();
		
	}

}

//Note : If WE Create parrent class reference and Creating Object in Child Class so Method Call In Child class 
//Note : So create a Object of child class and call overrided method the Method Of child class is Called

