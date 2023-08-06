import java.util.Scanner;
public class artikYil {

	public static void main(String[] args) {
		int yil,mod,n;
		Scanner s=new Scanner(System.in);
		System.out.println("yılı giriniz: ");
		yil=s.nextInt();
		
		n=yil%100;
		mod=yil%4;
		
		
		if (mod==0 && n!=0|| yil%400==0) {
			System.out.println(yil+" Bir artık yıldır.");
		} else {
			System.out.println(yil+" Bir artık yıl değildir.");
		}
	}

}
