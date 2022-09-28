import java.util.Iterator;
/* for loop */
public class Main {

	public static void main(String[] args) {
		int sayi = 15;
		
		for (int i = 1; i <= sayi; i++) {
			System.out.println(i);
		}
	System.out.println("For döngüsü bitti...");
	System.out.println("-------------------------");
	
/* while loop */
		int i = 1;
		while(i <= sayi) {
		System.out.println(i);
		i++;
	}
	System.out.println("While döngüsü bitti...");
	System.out.println("-------------------------");
/* do-while loop*/
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j <= 15);
	System.out.println("Do-while döngüsü bitti...");
	
	}
		
	}

