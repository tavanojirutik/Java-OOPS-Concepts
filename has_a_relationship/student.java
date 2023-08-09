package has_a_relationship;

public class student {
	private String sname;
	private int roll;
	private char div;
	
	private reception r;
	
	student(){
		
	}
	
	student(String sname,int roll,char div){
		this.sname=sname;
		this.roll=roll;
		this.div=div;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public char getDiv() {
		return div;
	}

	public void setDiv(char div) {
		this.div = div;
	}

	public reception getR() {
		return r;
	}

	public void setR(reception r) {
		this.r = r;
	}
	
	public void stdDetails() {
		System.out.println("Student Name : "+sname);
		System.out.println("Roll Call : "+roll);
		System.out.println("Division Of Student : "+div);
		
		if(r != null) {
			r.receptionDetail();
			r.feespay();
		}else 
			System.out.println("    FIRST PAY YOUR CLASS FEES    ");
		
	}
	
	
}
