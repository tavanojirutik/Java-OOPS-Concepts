package overrinding;

	class car{
		public static void start() {
			System.out.println("Car Start ");
		}
		public void accelerate() {
			System.out.println("Car accelerate");
		}
		public void changeGear() {
			System.out.println("Gear change");
		}
	}
	
	class LuxaryCar extends car
	{
		public static void start() {
			System.out.println("Automatic Start ");
		}
		public static void ruf() {
			System.out.println("Sunroof  ");
		}
	}
public class car_evaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LuxaryCar l=new LuxaryCar();
		l.ruf();
		l.start();
	}

}

//Note : So create a Object of child class and call overrided method the Method Of child class is Called

