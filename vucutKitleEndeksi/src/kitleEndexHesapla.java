import java.util.Scanner;
public class kitleEndexHesapla {

	public static void main(String[] args) {
		double boy,kilo,kitleEndeks;
		Scanner s=new Scanner(System.in);
		System.out.print("Boy ve kilonuzu giriniz: ");
		boy=s.nextDouble();
		kilo=s.nextDouble();
		
		kitleEndeks=(kilo/(boy*boy));
		System.out.print("Vücut Kitle Endeksiniz: "+kitleEndeks);

	}

}
