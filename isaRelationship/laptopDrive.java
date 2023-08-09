package isaRelationship;

	class laptop
	{
		private String Brand;
		private String ssd;
		private String screen;
		private int port;
		private String Processor;
		private int price;
		
		laptop(String Brand,String ssd,String screen,int port,String Processor,int price){
			this.Brand=Brand;
			this.ssd=ssd;
			this.screen=screen;
			this.port=port;
			this.Processor=Processor;
			this.price=price;
		}
		
		public void setBrand(String Brand) {
			this.Brand=Brand;
		}
		public String getBrand() {
			return Brand;
		}
		
		
		public void setSsd(String ssd) {
			this.ssd=ssd;
		}
		public String getSsd() {
			return ssd;
		}
		
		public void setScreen(String Screen) {
			this.screen=screen;
		}
		public String getScreen() {
			return screen;
		}
		
		public void setPort(int port) {
			this.port=port;
		}
		public int getPort() {
			return port;
		}
		
		public void setProcessor(String Processor) {
			this.Processor=Processor;
		}
		public String getProcessor() {
			return Processor;
		}
		
		public void setPrice(int price) {
			this.price=price;
		}
		public int getPrice() {
			return price;
		}
				
		public void details()
		{
			System.out.println("Laptop Brand : "+Brand);
			System.out.println("SSD Size : "+ssd);
			System.out.println("Screen Ratio : "+screen);
			System.out.println("Number Of Port : "+port);
			System.out.println("Processor : "+Processor);
			System.out.println("Laptop Price : "+price);
		}
		
	}

public class laptopDrive {

	public static void main(String[] args) {
		laptop l=new laptop("Lenovo !deapad 3","1TB","12Hzs",4,"AMD Ryzen 5600H",55000);
		l.details();
		
	}

}
