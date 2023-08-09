package Constructer;

	class emp{
		String name ;
		int empno;
		String post;
		String shift;
		float timestart ,timeend;
		
		emp(){
			System.out.println("---------Employee Details----------");
		}
		
		emp(String name , int empno){
			this();
			this.name=name;
			this.empno=empno;
			System.out.println("Employee Name : "+name);
			System.out.println("Employee Number : "+empno);
		}
		
		emp(String name , int empno,String post , String shift)
		{
			this(name,empno);
			this.post=post;
			this.shift=shift;
			System.out.println("Employee Post is :"+post);
			System.out.println("Employee Shift is :"+shift);
		}
		
		emp(String name , int empno,String post , String shift ,float timestart ,float timeend)
		{
			this(name,empno,post,shift);
			this.timestart=timestart;
			this.timeend=timeend;
			
			System.out.println("Start time : "+timestart);
			System.out.println("End Time : "+timeend);
		}
		
	}


public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp e=new emp("Raju",101,"Developer","Day Shift",9.00f,5.00f);
		
		

	}

}
