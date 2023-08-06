import java.util.Scanner;
public class sinifGecmeDurumu {

	public static void main(String[] args) {
		int mat,fizik,turkce,kimya,muzik,sayac=0,toplam=0; double ort;
		Scanner s=new Scanner(System.in);
		System.out.println("Matematik Notunu giriniz: ");
		mat=s.nextInt();
		if (mat>0 && mat<101) {
			toplam+=mat;
			sayac++;
			
		} else {
			System.out.println("Geçersiz not girdiniz");
		}
		
		System.out.println("Türkçe Notunu giriniz: ");
		turkce=s.nextInt();
		if (turkce>0 && turkce<101) {
			toplam+=turkce;
			sayac++;
			
		} else {
			System.out.println("Geçersiz not girdiniz");
		}
		
		System.out.println("Fizik Notunu giriniz: ");
		fizik=s.nextInt();
		if (fizik>0 && fizik<101) {
			toplam+=fizik;
			sayac++;
			
		} else {
			System.out.println("Geçersiz not girdiniz");
		}
		
		System.out.println("Kimya Notunu giriniz: ");
		kimya=s.nextInt();
		if (kimya>0 && kimya<101) {
			toplam+=kimya;
			sayac++;
			
		} else {
			System.out.println("Geçersiz not girdiniz");
		}
		
		System.out.println("Müzik Notunu giriniz: ");
		muzik=s.nextInt();
		if (muzik>0 && muzik<101) {
			toplam+=muzik;
			sayac++;
			
		} else {
			System.out.println("Geçersiz not girdiniz");
		}
		
		ort=((toplam)/sayac);
		if (ort>=55) {
			System.out.println("Notunuz: "+ort +"Geçti");
		}
		else {System.out.println("Notunuz: "+ort +"Kaldı");}
		
	}
	

}
