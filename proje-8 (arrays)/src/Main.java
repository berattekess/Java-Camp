
public class Main {

	public static void main(String[] args) {
		String sehir1 = "Adana";
		String sehir2 = "Ankara";
		String sehir3 = "İzmir";
		String sehir4 = "İstanbul";
		
		System.out.println(sehir1);
		System.out.println(sehir2);
		System.out.println(sehir3);
		System.out.println(sehir4);
		
		System.out.println("------------------------------");
		
		String[] sehirler = new String[4];
		sehirler[0] = "Diyarbakır";
		sehirler[1] = "Gaziantep";
		sehirler[2] = "Manisa";
		sehirler[3] = "Eskişehir";
		
		for (int i = 0; i < sehirler.length; i++) {
			System.out.println(sehirler[i]);
		}
		
		System.out.println("------------------------------");
		
		for(String sehir : sehirler) {
			System.out.println(sehir);
		}
		
		System.out.println("--------------------------------------------------");
		
                                    /* Multi Dimensional Array*/
		
			String ogrenciler[][] = new String[3][3];
			
			ogrenciler[0][0] = "Berat";
			ogrenciler[0][1] = "Emre";
			ogrenciler[0][2] = "Halil";
			ogrenciler[1][0] = "Yusuf";
			ogrenciler[1][1] = "Ersin";
			ogrenciler[1][2] = "Hasan";
			ogrenciler[2][0] = "Hamza";
			ogrenciler[2][1] = "Mert";
			ogrenciler[2][2] = "Alperen";
			
			for (int i = 0; i <= 2; i++) {
				for(int j = 0; j <= 2; j++) {
					System.out.println(ogrenciler[i][j]);
				}
				System.out.println("-------------");
			}
			
	}
	
}

	


