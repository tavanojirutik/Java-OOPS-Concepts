package InnerClass;
	//Local Inner Class
	class Demo
	{
		public void display() {
			class inner{
				public void show() {
					System.out.println("Show Method");
				}
			}
			inner i=new inner();
			i.show();
		}
		
	}

public class LocalInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.display();
	}

}
