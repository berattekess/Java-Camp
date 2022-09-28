
public class Main {

	public static void main(String[] args) {
			String mesaj = sehirVer();
			System.out.println(mesaj);
			
			int sonuc = topla(15,3);
			System.out.println(sonuc);
			int toplam = toplam2(1,2,3,4,5,6,7,8,9,10,11,12,13);//variable arguments
			System.out.println(toplam);

	}
	
	public static String sehirVer() {
		return "Adana";
	}
	
	public static int topla (int x, int y) {
		return x+y;
	}
	
/* variable arguments*/	
	public static int toplam2(int... sayilar) {
		int toplam = 0;
		for (int i : sayilar) {
			toplam = toplam + i;
		}
		return toplam;
	}
}
