import java.util.Iterator;
import java.util.Scanner;
public class asalSayi {

	public static void main(String[] args) {
		
		for (int i = 2; i <= 100; i++) {
			
			int a=0;
			for (int j = 2; j < i; j++) {
				if (i%j==0) {
					a++;
					break;
				}
				
			}
			if (a==0) {
				System.out.println(i);
			
			}
			
		}

	}

}
