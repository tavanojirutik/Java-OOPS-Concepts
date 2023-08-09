package Inheritance;
//Hierarchical Inheritance
	class banks{
		String name = "Rutik";
		long accountNo = 1701440105l;
		float bal =5000f;
		float add = 2000f;
		
		public void bal() {
			System.out.println("Account Holde name : "+name);
			System.out.println("Account Number : "+accountNo);
			System.out.println("Available Balance : "+bal);
			
			System.out.println("=============================");
		}
	}
	
	class add extends banks{
		
		public void add() {
			bal = bal+add;
			System.out.println("Adding Balance : "+bal);
		}
	}
	
	class debit extends banks{
		float debit = 100.57f;
		public void debit() {
			bal=bal-debit;
			System.out.println("Debited Balance : "+bal);
		}
	}

public class tranasaction {

	public static void main(String[] args) {
		add a=new add();
		a.bal();
		a.add();
		debit d =new debit();
		d.debit();

		

	}

}
