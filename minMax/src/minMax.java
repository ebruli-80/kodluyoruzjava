import java.util.Scanner;
public class minMax {

	public static void main(String[] args) {
		int x,y,min=0,max=1,adet;
		Scanner s=new Scanner(System.in);
		System.out.println("Kaç adet sayı gireceksiniz: ");
		adet=s.nextInt();
		
		while (adet>0) {
			System.out.println("sayı giriniz: ");
			x=s.nextInt();
			if (x>max) {
				max=x;
			}
			
			if(x<min || min==0){
				min=x;
			}
			
			adet--;
		}System.out.println("min: "+ min + " max: "+max);
		
		
	}

}
