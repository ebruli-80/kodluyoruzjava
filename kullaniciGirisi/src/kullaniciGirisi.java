import java.util.Scanner;
public class kullaniciGirisi {

	public static void main(String[] args) {
		String kullaniciAdi,sifre; 
		Scanner s=new Scanner(System.in);
		System.out.println("Kullanıcı Adını giriniz: ");
		kullaniciAdi=s.nextLine();
		System.out.println("Şifreyi giriniz: ");
		sifre=s.nextLine();
		
		if (kullaniciAdi.equals("Ebru")&& sifre.equals("12345")) {
			System.out.println("Giriş Başarılı");
		} else {
			System.out.println("Hatalı Giriş Yaptınız!!!");
		}
	}

}
