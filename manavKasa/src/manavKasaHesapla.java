import java.util.Scanner;
public class manavKasaHesapla {

	public static void main(String[] args) {
		int kilo,Armut,Elma,Domates,Muz,Patlıcan; 
		double fiyat,AK=2.14,EK=3.67,DK=1.11,MK=0.95,PK=5.00;
		Scanner s=new Scanner(System.in);
		System.out.println("Armut Kaç kilo: ");
		Armut=s.nextInt();
		System.out.println("Elma Kaç kilo: ");
		Elma=s.nextInt();
		System.out.println("Domates Kaç kilo: ");
		Domates=s.nextInt();
		System.out.println("Muz Kaç kilo: ");
		Muz=s.nextInt();
		System.out.println("Patlıcan Kaç kilo: ");
		Patlıcan=s.nextInt();
		
		fiyat=(Armut*AK)+(Elma*EK)+(Domates*DK)+(Muz*MK)+(Patlıcan*PK);
		System.out.println("Toplam Tutar: "+fiyat);
	}

}
