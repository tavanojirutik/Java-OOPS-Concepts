package Apstract;

	abstract class hospital {
		
		abstract void emergency();
		abstract void appoinment();
		abstract void admit();
		abstract void billing();
		
		
	}
	
	class myhospital extends hospital{
		void emergency() {
			System.out.println("Emergency Secation");
		}
		void appoinment() {
			System.out.println("Appoiment Secation ");
		}
		void admit() {
			System.out.println("Admit Secation");
		}
		void billing()
		{
			System.out.println("Billing Deparment");
		}
		
		void meth() {
			System.out.println("Calling meth");
		}
		
	}
	
	

public class HospitalDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hospital m=new myhospital();
		m.admit();
		m.appoinment();
		m.billing();
		m.admit();
		m.meth();
	}

}
