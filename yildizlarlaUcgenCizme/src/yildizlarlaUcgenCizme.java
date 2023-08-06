import java.util.Scanner;
public class yildizlarlaUcgenCizme {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("n sayısını giriniz: ");
		n=s.nextInt();
		
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=(n-i); j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <=(2*i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int l = n; l >=1; l--) {
			for (int m =1; m <=(n-l); m++) {
				System.out.print(" ");
			}

			for (int a =1 ; a <=(2*l)-1; a++) {
				System.out.print("*");
			}
			System.out.println();
		}

}
}
