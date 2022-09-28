import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int sayi = 33;
		boolean asalMı = true;
		
		for(int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				asalMı = false;
				break;
			}
		}
		
			if (asalMı) {
				System.out.println("sayi asal.");
			}
			else {
				System.out.println("sayi asal degil");
			}
			
			
			
			
	}

}
