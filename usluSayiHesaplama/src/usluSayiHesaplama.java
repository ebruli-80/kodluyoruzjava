import java.util.Scanner;
public class usluSayiHesaplama {

	public static void main(String[] args) {
		int taban,us,sayi=1;
		Scanner s=new Scanner(System.in);
		System.out.println("üssü alınacak sayıyı giriniz: ");
		taban=s.nextInt();
		System.out.println("üs değerini giriniz: ");
		us=s.nextInt();
		for (int i = 1; i <=us; i++) {
			
				sayi*=taban;
			
		}
		System.out.println(sayi);
	}

}
