import java.util.Iterator;
import java.util.Scanner;
public class tersUcgen {

	public static void main(String[] args) {
		int sayi;
		Scanner s=new Scanner(System.in);
		System.out.println("sayı giriniz:");
		sayi=s.nextInt();
		
		for (int i = sayi;0<i; i--) {
			for (int j = i; j < sayi; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=(2*i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
