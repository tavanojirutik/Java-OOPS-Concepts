package ConstructerChaining;

public class employee {
	
	public employee() {
		this("Pooja","Graphic Artist");

	}
	
	public employee(String name , String post) 
	{
		this("Pooja","Graphic Artist",22562);
		System.out.println("Employee Name is : "+name);
		System.out.println("Employee Post is : "+post);
	}
	
	public employee(String name , String post , int empid){
		this("Pooja","Graphic Artist",22562,2154125478l);
		empid=5521;
		
		System.out.println("Employee ID is : "+empid);
	}
	
	public employee(String name , String post , int empid , long mobile) {
		mobile = 458964522l;
		System.out.println("Employee Mobile Number IS : "+mobile);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new employee();
	}

}
