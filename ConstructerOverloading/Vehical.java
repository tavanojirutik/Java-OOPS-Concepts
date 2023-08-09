package ConstructerOverloading;

public class Vehical {
	String vehicalType ;
	String brand ;
	String modalName;
	int modalNumber;
	int price;
	
	Vehical(String vehicalType , String brand){
		this.vehicalType=vehicalType;
		this.brand=brand;
	}
	
	Vehical(String modalName){
		this.modalName=modalName;
	}
	Vehical(int modalNumber , int price){
		this.modalNumber = modalNumber;
		this.price=price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehical v1 =new Vehical("Car","BMW");
		Vehical v2 = new Vehical("X7");
		Vehical v3 = new Vehical(7,10000000);
		
		System.out.println("Vehical Brand is : "+v1.brand);
		System.out.println("Vehical Type is : "+v1.vehicalType);
		System.out.println("Vehical Modal Name is : "+v2.modalName);
		System.out.println("Vehical ModalNumber is : "+v3.modalNumber);
		System.out.println("Vehical Price is : "+v3.price);
		
		//If We Define The another object in another state. The Output is Display NULL
		
		System.out.println("=========================================");
		System.out.println(v1.modalName);
		System.out.println(v1.modalNumber);
		
	}

}
