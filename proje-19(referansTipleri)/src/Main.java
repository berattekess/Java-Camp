
public class Main {

	public static void main(String[] args) { /* burası deger tipli oldugu için ilk atamadaki sayi2 degerini basatırdı*/
		int sayi1 = 20;
		int sayi2 = 35;
		sayi1 = sayi2;
		sayi2 = 15;
		System.out.println(sayi1);
		
		
		int[] sayilar1 = {1,2,3,4,5,6,7,8,9};
		int[] sayilar2 = {10,11,12,13,14,15,16};
		
		sayilar1 = sayilar2;
		sayilar2[4] = 99;
		System.out.println(sayilar2[4]); /* burasi referans tipli oldugu için ilk atamanın sonucunu degil son yaptıgım diger atamanın sonucu bastırdı*/

	}

}
