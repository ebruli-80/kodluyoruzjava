import java.util.Scanner;
public class kdvHesapla {

	public static void main(String[] args) {
		double fiyat,kdvOran=0.18,kdvTutar,kdvliTutar;
		Scanner s=new Scanner(System.in);
		System.out.print("Fiyatı giriniz: ");
		fiyat=s.nextDouble();
		if(fiyat>0 && fiyat<1000) 
		{
			kdvOran=0.18;
		}
		else if(fiyat>1000)
		{
			kdvOran=0.8;
		} 
		kdvTutar=fiyat*kdvOran;
		kdvliTutar=fiyat+kdvTutar;
		System.out.println("KDV Oranı: "+kdvOran);
		System.out.println("KDV tutarı: "+kdvTutar);
		System.out.println("KDV'siz Tutar: "+fiyat);
		System.out.println("KDV'li Tutar: "+kdvliTutar);
		
	}

}
