package variable;

public class variable {
	
	String firstname = "Rutik";         //Global Varibale
	String lastname = "Tavanoji";
	
	public variable() {
		long phono = 8765656677l;
		int rollcall = 55;				//Local Variable 
		
		System.out.println("First Name : "+firstname);
		System.out.println("Last Name : "+lastname);
		System.out.println("Phone Number : "+phono);
		System.out.println("Roll Number : "+rollcall);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variable v=new variable();
		
	}

}
