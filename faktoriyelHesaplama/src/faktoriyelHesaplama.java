import java.util.Scanner;
public class faktoriyelHesaplama {

	public static void main(String[] args) {
		int n,factoriyel=1,r,factoriyelN=1,factoriyelR=1,C;
		Scanner s=new Scanner(System.in);
		System.out.println("n sayısını giriniz: ");
		n=s.nextInt();
		/*	for (int i = 1; i <=n; i++) {
			factoriyel*=i;
		}
		System.out.println(factoriyel); */
		
		
		System.out.println("r değerini giriniz:");
		r=s.nextInt();
		int yeni=n-r;
		for (int i = 1; i <= n; i++) {
			factoriyelN*=i;
			}
		for (int j = 1; j <= r; j++) {
			factoriyelR*=j;
		}
		for (int k = 1; k <= yeni; k++) {
			factoriyel*=k;
		}
		
		C=factoriyelN/(factoriyelR*(factoriyel));
		System.out.println("N'in R'li kombinasyonu: "+C);
		
	}

}
