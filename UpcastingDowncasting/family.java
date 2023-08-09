package UpcastingDowncasting;

class father{
	String name;
	public void father() {
		System.out.println("I Want to Buy Land...");
	}
}

class son extends father{
	String namee;
	public void sonn() {
		System.out.println("I want to Buy Car...");
	}
}

public class family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		father f=new son();
		f.name="Father Said :: ";
		System.out.print(f.name);
		f.father();
		
		son s=(son)f;
		s.namee="Son Said :: ";
		System.out.print(s.namee);
		s.sonn();
		
		
		
	}

}
