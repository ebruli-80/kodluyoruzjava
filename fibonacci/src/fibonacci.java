import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		int x,a=0,b=1,c;
		Scanner s=new Scanner(System.in);
		System.out.println("hesaplanacak eleman sayısı: ");
		x=s.nextInt();
		System.out.println(a+"\n"+ b);//en aşagı yazarsak son değerlerini yazıyor dongüden çıktıktan sonra çalıştığı için o yüzden başa yazıyoruz.
		for (int i = 2; i <= x; i++) {//burada döngüyü 0 dan başlatsakta en baştaki 0 ve 1i elde edemitoruz o yüzden onları haricen başta yazdırdık ve döngüyü 2 den başlattık.
			
			c=a+b;
			a=b;		//bu kısım swapin yani atlatma kısmı sayıları bir kaydırıyoruz.
			b=c;
			System.out.println(c);
		}
		

	}

}
