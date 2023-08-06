import java.util.Iterator;
import java.util.Scanner;
public class ikininKuvvetiniBulma {

	public static void main(String[] args) {
		int sayi;
		Scanner s=new Scanner(System.in);
		System.out.println("sayı değerini giriniz: ");
		sayi=s.nextInt();
		
	/*	for (int i = 1; i <= sayi; i*=2) {
			System.out.println(i);
		}*/
		
		
		
		for (int i = 1; i <=sayi; i*=4) {
			System.out.println("dörtün katı:"+i);
			
		}
		
		for (int j = 1; j <=sayi; j*=5) {
			System.out.println("beşin katı: "+j);
		}

	}

}
