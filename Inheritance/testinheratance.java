package Inheritance;
//Multilevel Inheritance
class birds {
	public void fly() {
		System.out.println("Birds Are Fly");
	}
}
class animal extends birds {
	public void forest() {
		System.out.println("Animal Lives In Forest & survive in Forest ");
	}
}

class fish extends animal{
	public void fishh() {
		System.out.println("Fish are lives in water ");
	}
}
public class testinheratance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fish f=new fish();
		f.fly();
		f.forest();
		f.fishh();
		}

	}
