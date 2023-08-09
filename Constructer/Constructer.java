package Constructer;

	class Bike {
	
	String Bike = "Honda";
	String Modal = "CB Shine";
	int Price=  88170;
	int year = 2023;
}
	
	class car{
		String Car ="Suzuki";
		String Modall ="Ertiga";
		int priceCar= 10000000;
		int yearCar = 2023;
		
		
	}

	
	public class Constructer{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike c =new Bike();
		System.out.println("Bike company :- "+c.Bike);
		System.out.println("Bike Modal :- "+c.Modal);
		System.out.println("Bike Price :- "+c.Price);
		System.out.println("Year Of Modal :- "+c.year);
		
		System.out.println("=============================");
		
		car c1 = new car();
		System.out.println("Car Company :- "+c1.Car);
		System.out.println("Car Modal :- "+c1.Modall);
		System.out.println("Car Price :- "+c1.priceCar);
		System.out.println("Car Year of modal :- "+c1.yearCar);
	}

}
