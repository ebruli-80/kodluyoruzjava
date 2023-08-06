import java.util.Scanner;
public class armstrongSayi {

	public static void main(String[] args) {
		int sayi,basamakSayisi=0,sayidegeri,toplam=0,basamakUs;
		Scanner s=new Scanner(System.in);
		System.out.println("sayıyı giriniz: ");
		sayi=s.nextInt();
		int tempNumber=sayi;//burada dışarıdan girilen sayıyı kaybetmemek adına geçici bir değere atıyoruz.
		//sayının kaç basamaklı olduğunu buluyooruz.bunun için veri türünden yaralanıyoruz.
		//kaç kere döneceğini bilmediğimiz içinde while döngüsünü kullanıyoruz.
		while (tempNumber!=0) {
			basamakSayisi++;
			tempNumber/=10;
		}
		//System.out.println("basamak sayısı:"+basamakSayisi);
		tempNumber=sayi;
		while (tempNumber!=0) {
			sayidegeri=tempNumber%10;  //burada modunu alarak sayının basamak değerlerini buluyoruz.
			basamakUs=1;
			for (int i = 0; i < basamakSayisi; i++) {
				basamakUs*=sayidegeri;
			}
			
			toplam+=basamakUs;
			tempNumber/=10;           //buradada sayıyı 10 a bölerek son basamagını siliyoruz ki yeni basamak değerini bulalım.
		}
		//System.out.println(toplam);
		
		if (sayi==toplam) {
			System.out.println(sayi+"  sayısı bir armstrong sayısır.");
		} else {
			System.out.println(sayi+"  sayısı bir armstrong sayı değildir.");
		}
		
	}

}
