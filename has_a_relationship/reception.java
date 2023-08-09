package has_a_relationship;

public class reception {
	
		private int stdid;
		private int std;
		private int fees = 3000;
		
		reception(int stdid,int std){
			this.stdid=stdid;
			this.std=std;
	
		}

		public int getStdid() {
			return stdid;
		}

		public void setStdid(int stdid) {
			this.stdid = stdid;
		}

		public int getStd() {
			return std;
		}

		public void setStd(int std) {
			this.std = std;
		}

		public int getFees() {
			return fees;
		}

		public void setFees(int fees) {
			this.fees = fees;
		}
		
		public void receptionDetail() {
			System.out.println("===== reception Detail =====");
			System.out.println("Student Id : "+stdid);
			System.out.println("Student Stanadard : "+std);
			System.out.println("Student Fees : "+fees);
		}
		
		public void feespay() {
			System.out.println(" ===== Fees Paid You Can Enter Classroom ===== ");
			System.out.println("Fees Amount : "+fees);
		}
}
