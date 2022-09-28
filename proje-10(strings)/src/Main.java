
public class Main {

	public static void main(String[] args) {
		String kelime = "Herkese merhaba ben java öğreniyorum.";
		System.out.println(kelime);
		System.out.println("eleman sayısı = "+kelime.length());  //.lenght ile eleman sayısını bulabilirim.
		System.out.println("7.eleman = "+kelime.charAt(6));  //.charAt fonksiyonu ile istedigim elemanı çıktı alabilirim.
		System.out.println(kelime.concat(" Çok heyecanlıyım"));  //burada istedigim cümleyi veya kelimeyi stringe ekleyebilirim.(geçici kullanım!)
		System.out.println(kelime.startsWith("H"));  //string ifademin hangi harfle başladıgını kontrol eder ve boolean değer döndürür.
		System.out.println(kelime.endsWith("c"));  //string ifademin hangi harfle bittiğini kontrol eder ve boolean değer döndürür.
		
		
		char[] karakterler = new char[10];
		kelime.getChars(0, 5, karakterler, 0);  //4 parametre alır string ifademin 0.indexinden 5.indexine(5 dahil degil) kadar alır ve karakter array e 0.indexten yollar.
		System.out.println(karakterler);
		
		System.out.println(kelime.indexOf('a'));  // burada a harfinin ilk kaçıncı indexte oldugunu veriyor.sadece char girmek zorunda değilim.
		System.out.println(kelime.lastIndexOf('a'));  // burada a harfini bulmaya sondan başlar fakat index sayarken baştan gidilir.
		
		System.out.println(kelime.replace('e', 'é'));  //string ifademde e leri é ile değiştirdim.(kalıcı değil)
		
		System.out.println(kelime.substring(2));  // ilk iki harfi atar ver çıktıyı verir.
		System.out.println(kelime.substring(2, 4));  //burada ilk iki harfi attı ve 4.indexe kadar 4 dahil olmadan yazdı.
		
		for(String klm : kelime.split(" ")) {  //burada parantez içine girdigim karaktere sıra gelince cümle parçalara ayrılıyor 
			System.out.println(klm);
		}
		
		System.out.println(kelime.toLowerCase());  // bütün harfleri küçük yazar.
		System.out.println(kelime.toUpperCase());  // bütün harfleri büyük yazar.
		
		
		String cumle = "     MERHABALAR    ";
		System.out.println(cumle.trim());  // trim fonksiyonu eger string ifademin başında veya sonunda boşlul varsa onları siler.
	}

}
