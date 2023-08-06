import java.util.Scanner;
public class tekSayilarinToplami {

	public static void main(String[] args) {
		int n,toplam=0,m;
		Scanner s=new Scanner(System.in);
		/*	
		 * Tek sayıların toplamını bulan program
		 * 
		 * System.out.println("sayı giriniz: ");
		n=s.nextInt();
		if (n>0) {
			for (int i = 0; i <= n; i++) {
				if(i%2!=0){
					toplam+=i;
				}
			}
			System.out.println(toplam);
		}else {
			System.out.println("negatif sayı girdiniz.");
		} 
		*/
		
		//girilen çift ve dördün katlarının toplamını bulan program
		do {
			System.out.println("bir sayı giriniz: ");
			m=s.nextInt();
			if(m%4==0) {
				toplam+=m;
			}
			System.out.println("4'ün katları toplamı: "+toplam);
			
		} while (m%2==0);
		
		System.out.println("tek sayı girdiniz.");
		
		
	}

}
