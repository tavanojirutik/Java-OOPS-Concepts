package Inheritance;
	//Single Level Inheritance 
	class bank{
		String name = "Rutik";
		long acno = 1701440107l;
		double bal = 4000;
		
		public void bankdetail() {
			System.out.println("Holder Name : "+name+"\n Account Number : "+acno+"\n Available Balance is : "+bal);
		}
	}
	
	class deposit extends bank{
		float deposit = 3500.00f;
		
		public void deposits() {
			System.out.println("After Deposit amount is : "+deposit);

		}
	}

public class cust {

	public static void main(String[] args) {
		
		deposit d=new deposit();
		d.bankdetail();
		d.deposits();
		

	}

}
