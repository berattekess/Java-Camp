
public class Main {

	public static void main(String[] args) {
		//class lar referans tiplidir.
		
		CustomerManager customerManager ;
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.add();
		customerManager.remove();
		customerManager.update();
	}

}
