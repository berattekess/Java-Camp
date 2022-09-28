
public class Main {

	public static void main(String[] args) {
		int[] sayilar = {1,3,5,7,9,11,13,15,17,19};
		int aranacak = 8;
		boolean varMı = false;
		for (int i : sayilar) {
			if(aranacak == i) {
				varMı = true;
				break;
			}
			
			else {
				varMı = false;
				break;
			}
		}
		
		if(varMı ==true) {
			System.out.println("aranan sayi bulundu.");
		}
		else {
			System.out.println("aranan sayi bulunamadi.");
		}
	}

}
