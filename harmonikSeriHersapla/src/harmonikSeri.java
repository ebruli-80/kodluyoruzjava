import java.util.Scanner;
public class harmonikSeri {

	public static void main(String[] args) {
		int sayi; double toplam=0;
		Scanner s=new Scanner(System.in);
		System.out.println("sayı giriniz:");
		sayi=s.nextInt();
		
		for (double i =1 ; i <=sayi; i++) {//burada i değerini double tanımlamamızın sebebi integer değeri double değere bölersek 
			//sonuç double çıkıyor yani doğru sonuç veriyor aksi durumda hep 1 değerini veriyor.
			//yada tam tersi 1/i değerindeki 1 i "1.0" şeklinde yazmamız gerek.
			toplam+=(1/i);
		}
		System.out.println(toplam);
	}

}
