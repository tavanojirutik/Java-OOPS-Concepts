package interfacess;

	class mobile{
		void call() {
			System.out.println("Mobile Are use for Calling");
		}
		void sms() {
			System.out.println("Mobile Are use for Message");
		}
	}
	
	interface icamera{
		void camera();
	}
	
	interface videoCall{
		void videoCal();
	}
	
	class SmartPhone extends mobile implements icamera ,videoCall{
		public void camera() {
			System.out.println("Capturing Greate Picture Using Mobile Camera");
		}
		public void videoCal() {
			System.out.println("Video Call Feature Are Available in Smart Phone");
		}
		
		void Scanner() {
			System.out.println("Scanning Feature are allow");
		}
	}

public class MobileDrive {

	public static void main(String[] args) {
		SmartPhone s=new SmartPhone();
		s.call();
		s.camera();
		s.videoCal();
		s.Scanner();
		s.sms();4

	}

}
