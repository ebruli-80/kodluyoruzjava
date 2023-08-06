import java.util.Scanner;
public class ebobveekokbul {

	public static void main(String[] args) {
		int x,y,ebob=1,ekok=1;
		Scanner s=new Scanner(System.in);
		System.out.println("x sayısını giriniz: ");
		x=s.nextInt();
		System.out.println("y sayını giriniz: ");
		y=s.nextInt();
		int i=1;
		while (i<=x) {
			if (x%i==0 && y%i==0) {
				ebob=i;
			}
			i++;
			
		}System.out.println(ebob);
		
		int j=1;
		while (j<(x*y)) {
			if (j%x==0 && j%y==0) {
				
			}
			j++;
			
		}System.out.println(j);
		
	/*	for (int i = 1; i <= x; i++) {
			if (x%i==0 && y%i==0) {
				ebob=i;
			}
		}
		System.out.println(ebob);	
		
		for (int j = x; j >=1; j--) {
			if (x%j==0 && y%j==0) {
				ebob=j;
				System.out.println(ebob);
				break;
			}
		}	*/
		
		
		
	/*	for (int i = 1; i <=(x*y); i++) {
			if (i%x==0 && i%y==0) {
				System.out.println(i);
				break;
			}
		}	*/
	}

}

