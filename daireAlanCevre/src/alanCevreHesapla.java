import java.util.Scanner;
public class alanCevreHesapla {

	public static void main(String[] args) {
		double pi=3.14,alan,cevre,ddAlan; int r,alfa;
		Scanner s=new Scanner(System.in);
		System.out.print("Yarıçap değerini giriniz: ");
		r=s.nextInt();
		alan=(pi*(r*r));
		cevre=(2*(pi*r));
		System.out.println("Dairenin alanı: "+alan+"  "+"Dairenin Çevresi: "+cevre);
		
		System.out.println("Dairenin merkez açısının ölçüsünü giriniz: ");
		alfa=s.nextInt();
		ddAlan=(pi*(r*r)*alfa)/360;
		System.out.println("Daire diliminin alanı: "+ddAlan);
	}

}
