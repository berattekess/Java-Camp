
public class Main {

	public static void main(String[] args) {
		int sayi1 = 456;
		int sayi2 = 879;
		int sayi3 = 155;
		int enBuyukSayi=sayi2;
		
		if (enBuyukSayi<sayi1) {
			enBuyukSayi = sayi1;
		}
		
		if (enBuyukSayi<sayi3) {
			enBuyukSayi = sayi3;
		}
		
		System.out.println("En büyük sayı = "+enBuyukSayi);
		

	}

}
