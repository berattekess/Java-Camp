
public class Main {

	public static void main(String[] args) {
		double[] sayilar = {5.8,9.7,14.4,12.8,13.9};
		double total = 0;
		double max = sayilar[3];
		
		for (double sayi : sayilar) {
			if(max<sayi) {
				max = sayi;
			}
			total = total+sayi;
			System.out.println(sayi);
		}
		System.out.println("Sayıların toplamı = "+total);
		System.out.println("En büyük sayı = "+max);

	}

}
