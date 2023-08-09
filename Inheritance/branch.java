package Inheritance;


interface user1{
	public String Name = "Vishal";
	public long accno = 4500323232l;
	public static void user() {
		System.out.println("User1 Name : "+Name);
		System.out.println("User1 Account Number : "+accno);
	}
}

interface user2{
	public String Name2 = "";
	public long accno2 = 4355452232l;
	public static void user() {
		System.out.println("User2 Name : "+Name2);
		System.out.println("USer2 Account Number : "+accno2);
	}
}

class pvt implements user1 , user2{
	
	public static void bank() {
		System.out.println("Bank Access Successfully ");
	}
}

public class branch {

	public static void main(String[] args) {
		
		
	}

}
