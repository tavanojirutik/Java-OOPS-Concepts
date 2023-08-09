package Constructer;


class camlin{
	String Color;
	int price;
	int markerCode;
	
	//User Define Constructer
	camlin(String Color,int price,int markerCode){
		this.Color=Color;
		this.markerCode=markerCode;
		this.price=price;
	}
	
	camlin(){
		System.out.println("Undefined Constructer");
	}
}


public class Marker {
	public static void main(String[] args) {
		camlin c =new camlin("Blue",25,34343);
		System.out.println("========First Object=========");
		System.out.println("Color "+c.Color);
		System.out.println("Price "+c.price);
		System.out.println("Market Code "+c.markerCode);
		
		//Second Object Created
		
		camlin c1 =new camlin("Black",30,54324);
		System.out.println("=========Object Second==========");
		System.out.println("Color "+c1.Color);
		System.out.println("Price "+c1.price);
		System.out.println("Marker Code "+c1.markerCode);
		
		
		System.out.println("=======undefined Constructer=======");
		camlin c2 = new camlin();
		
		
	}

}


