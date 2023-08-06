import java.util.Scanner;
public class mukemmelSayi {

	public static void main(String[] args) {
		int x,toplam=0,a;
		Scanner s=new Scanner(System.in);
		System.out.println("sayı giriniz: ");
		x=s.nextInt();
		
		for (int i = 1; i <x; i++) {
			if (x%i==0) {
				toplam+=i;
			}
		}
		if (x==toplam) {
			System.out.println(x+ " sayısı bir mükemmel sayıdır");
		} else {
			System.out.println(x+ " sayısı bir mükemmel sayı değildir.");
		}
		
		
	}

}
