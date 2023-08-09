package Polymorphisam;
	
//Overloading is called as Compiletime Polymorphisam

	class match
	{
		public int m1(int num1,int num2) {
			return num2>num1?num1:num2;
		}
		
		public int m2(int num1,int num2,int num3) {
			if(num1>num2 && num1<num2) return num1;
			else if(num2>num3) return num2;
			return num3;
		}
	}

public class testDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		match m=new match();
		m.m1(3, 30);
		m.m2(2, 40, 20);
	}

}
