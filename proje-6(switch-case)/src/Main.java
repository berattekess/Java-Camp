
public class Main {

	public static void main(String[] args) {
		char harfNotu = 'F';
		
		switch(harfNotu) {
		case 'A': 
			System.out.println("Tebrikler : Geçtiniz...");
			break;
		case 'B':
			System.out.println("Çok güzel : Geçtiniz...");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz...");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz...");
			break;
		case 'F':
			System.out.println("Maalesef Kaldınız...");
			break;
		default: 
			System.out.println("Geçersiz not girdiniz...");
		}
	}

}
