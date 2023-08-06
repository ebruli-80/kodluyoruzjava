import java.util.Iterator;
import java.util.Scanner;
public class ciftBul {

	public static void main(String[] args) {
		int n,sayac=0,toplam=0;double ort;
		Scanner s=new Scanner(System.in);
		System.out.println("sayı giriniz: ");
		n=s.nextInt();
		/*for (int i = 0; i <= n; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}*/
		
		for (int i = 1; i <= n; i++) {
			if(i%3==0 && i%4==0) {
				toplam+=i;
				sayac++;
				System.out.println(toplam);
				System.out.println(sayac);
			}
		}
		ort=toplam/sayac;
		System.out.println("Sayıların ortalaması: "+ort);

	}

}
