import java.util.Scanner;
public class hipotenusVEalan {

	public static void main(String[] args) {
		int a,b,c; double u,alan,hipotenus;
		Scanner s=new Scanner(System.in);
		System.out.print("Üçgenin kenar değerlerini giriniz: ");
		a=s.nextInt();
		b=s.nextInt();
		hipotenus=Math.sqrt((a*a)+(b*b));
		System.out.println("Üçgenin hipotenüs değeri: "+hipotenus);
		//çevre hesaplama
		u=(a+b+hipotenus);
		System.out.println("Üçgenin Çevresi: "+u);
		//alan hesaplama
		 alan=(a*b)/2;
		 
		
		System.out.println("Üçgenin Alanı: "+alan);
	}

}
