package Constructer;


	class product{
		private int itemno=2;
		private String name="Rutik";
		private int price;
		private int qty;
		
		public product() {
			
		}
		
		public int getItemno() {
			return itemno;
		}
		public void setItemno(int itemno) {
			this.itemno = itemno;
			
		}
		public String getName() {
			return name;
		}
//		public void setName(String name) {
//			this.name = name;
//		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
		
		public product (int itemno,String name,int price,int qty) {
			this.itemno=itemno;
			this.name=name;
			this.price=price;
			this.qty=qty;
			setPrice(price);
	        setQty(qty);
	}
}
		
	
	class Customer{
		private int custid;
		private String name;
		private String add;
		private long phno;
		
		
		public int getCustid() {
			return custid;
		}
		public void setCustid(int custid) {
			this.custid = custid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAdd() {
			return add;
		}
		public void setAdd(String add) {
			this.add = add;
		}
		public long getPhno() {
			return phno;
		}
		public void setPhno(long phno) {
			this.phno = phno;
		}
		
		public Customer(int custid,String name,String add,long phno) {
			this.custid=custid;
			this.name=name;
			this.add=add;
			this.phno=phno;
			setAdd(add);
			setPhno(phno);
		}
		
	
	}
public class shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p=new product();
		p.setPrice(2000);
		p.setQty(3);
		
		System.out.println("----------(Product Details)----------");
		System.out.println("Name is : "+p.getName());
		System.out.println("Product Id iS : "+p.getItemno());
		System.out.println("Price is : "+p.getPrice());
		System.out.println("Quantity is : "+p.getQty());
		
		System.out.println("----------(Customer Details)----------");
		Customer c=new Customer(1, "iphone", "Kurla", 9969215478l);
		System.out.println("Product Id : "+c.getCustid());
		System.out.println("Product Name : "+c.getName());
		System.out.println("Address Is : "+c.getAdd());
		System.out.println("Phone Number : "+c.getPhno() 	);
		
		
		
		
		

	}

}