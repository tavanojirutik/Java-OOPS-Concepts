package has_a_relationship;

public class stdDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student("Rutik Tavanoji",67,'A');
		s.stdDetails();
		s.setR(new reception(102,10));
		s.stdDetails();
		
	}

}
