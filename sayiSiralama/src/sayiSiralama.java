import java.util.Scanner;
public class sayiSiralama {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("a değerini giriniz: ");
		a=s.nextInt();
		
		System.out.println("b değerini giriniz: ");
		b=s.nextInt();
		
		System.out.println("c değerini giriniz: ");
		c=s.nextInt();

		if ((a>b) && (a>c)) {
			if(b>c) {
			System.out.println("a>b>c");
			}
			else {
				System.out.println("a>c>b");
			}
		} else if((b>a)&&(b>c)) {
			if (a>c) {
				System.out.println("b>a>c");
			}
			else {
				System.out.println("b>c>a");
			}
		}else if((c>a)&&(c>b)) {
			if(a>b) {
				System.out.println("c>a>b");
			}
			else {
				System.out.println("c>b>a");
			}
		}
		
		
	}

}
