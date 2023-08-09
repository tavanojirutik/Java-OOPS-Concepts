package ConstructerOverloading;

//Constructor Chaining 

public class Laptop {
	String laptopName;
	String laptopType;
	String ram;
	String hardDisk;
	String Processor;
	int price;
	
	Laptop(String laptopName,String laptopType){
		this.laptopName=laptopName;
		this.laptopType=laptopType;
	}
	
	Laptop(String laptopName,String laptopType , String ram , String hardDisk){
		this(laptopName , laptopType);
		this.ram=ram;
		this.hardDisk=hardDisk;
	}
	
	Laptop(String laptopName,String laptopType , String ram , String hardDisk , String Processor , int price){
		this(laptopName, laptopType,ram,hardDisk);
		this.Processor=Processor;
		this.price=price;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l =new Laptop("Dell","Gameing","8GB","500GB","Intel I7",800000);
		System.out.println("Laptop Name : "+l.laptopName);
		System.out.println("Laptop Type : "+l.laptopType);
		System.out.println("Ram : "+l.ram);
		System.out.println("Hard Disk : "+l.hardDisk);
		System.out.println("Processor : "+l.Processor);
		System.out.println("Price : "+l.price);
		
		System.out.println("=================================================");
		
		Laptop l2 =new Laptop("Asus Vivo Book","Note Pad","8GB","500GB","Intel I3",300000);
		System.out.println("Laptop Name : "+l2.laptopName);
		System.out.println("Laptop Type : "+l2.laptopType);
		System.out.println("Ram : "+l2.ram);
		System.out.println("Hard Disk : "+l2.hardDisk);
		System.out.println("Processor : "+l2.Processor);
		System.out.println("Price : "+l2.price);
		
		
		
	}

	

}
