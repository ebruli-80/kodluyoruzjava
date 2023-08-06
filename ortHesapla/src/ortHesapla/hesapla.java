
package ortHesapla;

import java.util.Scanner;

public class hesapla {

	public static void main(String[] args) {
		//değişkenleri oluştur
		int mat,fizik,kimya,turkce,tarih,muzik;
		Scanner input=new Scanner(System.in);
		System.out.println("matematik notunu giriniz: ");
		mat=input.nextInt();
		
		System.out.println("fizik notunu giriniz: ");
		fizik=input.nextInt();
		
		System.out.println("kimya notunu giriniz: ");
		kimya=input.nextInt();
		
		System.out.println("türkçe notunu giriniz: ");
		turkce=input.nextInt();
		
		System.out.println("tarih notunu giriniz: ");
		tarih=input.nextInt();
		
		System.out.println("müzik notunu giriniz: ");
		muzik=input.nextInt();
		
		int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
		double sonuc=toplam/6;
		if(sonuc>60) {
			System.out.print(sonuc +"Geçti");
		}
		else System.out.print(sonuc +"Kaldı");
		//int x=(sonuc>60)?"Geçti":"Kaldı";
	}

}
