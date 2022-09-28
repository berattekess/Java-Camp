
public class Main {

	public static void main(String[] args) {
		char harf = 'e';
		
		switch(harf) {
		case 'a':
		case 'ı':
		case'o':
		case'u': System.out.println(" "+harf +" harfi kalın seslidir.");
				 break;
				 
		default: System.out.println("Girdiğiniz harf ince seslidir.");
		}
	}

}
