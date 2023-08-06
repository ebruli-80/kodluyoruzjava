import java.util.Scanner;
public class hesapMakinesi {

	public static void main(String[] args) {
		double x,y;
		String islem;
		Scanner s=new Scanner(System.in);
		System.out.println("X ve Y sayılarını giriniz: ");
		x=s.nextInt();
		y=s.nextInt();
		System.out.println("İşlem Sembolünü giriniz: ");
		islem=s.next(); //string alma olarak nextLine(); kullanınca olmadı başka benim gibi yapanlar bu ifadeyi kullanmış doğru sonuç veriyor.
		System.out.print("islem");
		switch(islem)
		{
		case "*": System.out.print("Sonuç: "+x*y);
		break;
		case "/": System.out.print("Sonuç: "+x/y);
		break;
		case "+": System.out.print("Sonuç: "+(x+y));
		break;
		case "-": System.out.print("Sonuç: "+(x-y));
		break;
		default: System.out.println("Geçersiz İşlem Girdiniz!!!");
		}
	}

}
