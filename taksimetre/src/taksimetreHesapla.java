import java.util.Scanner;
public class taksimetreHesapla {

	public static void main(String[] args) {
		double acilisucret=10,KM=2.20,mesafe,fiyat; int minTutar=20;
		Scanner s=new Scanner(System.in);
		System.out.print("Km değerini giriniz: ");
		mesafe=s.nextDouble();
		fiyat=(mesafe*KM)+acilisucret;
		if(fiyat>20) 
		{
			System.out.println("Ödenecek Tutar: "+fiyat);
		}
		else System.out.println("Ödenecek Tutar: "+minTutar);

	}

}
