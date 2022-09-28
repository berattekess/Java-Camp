
public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
	}
	
	public static void sayiBulmaca() {
		int sayilar[] = {1,3,5,7,9,11,13,15,17};
		int aranacak = 5;
		boolean varMi = false;
		
		for (int i : sayilar) {
			if (aranacak == i) {
				varMi = true;
				break;
			}
		}
		
		if(varMi == true) {
			mesajVer("sayi bulundu:"+aranacak);
		}
		else {
			mesajVer("sayi bulunamadi:"+aranacak);		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
