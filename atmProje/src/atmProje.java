import java.util.Scanner;
public class atmProje {

	public static void main(String[] args) {
		String kullaniciAdi,Sifre;
		int kalan=3,secim,bakiye=1500;
		
		
		while (kalan>0) {
			Scanner s=new Scanner(System.in);
			System.out.println("kullanıcı adı: ");
			kullaniciAdi=s.next();
			System.out.println("şifre: ");
			Sifre=s.next();
			
			if (kullaniciAdi.equals("ebru") && Sifre.equals("12345")) {
				System.out.println("giriş başarılı.");
				do {
					System.out.println("1-Para çekme\n"+ "2-Para yatırma\n"+ "3-Bakiye sorgulama\n"+ "4-Çıkış");
					System.out.println("yapmak istediğiniz işlemi seçiniz:");
					secim=s.nextInt();
					switch (secim) {
					case 1:
						System.out.println("para miktarı: ");
						int paraTutari=s.nextInt();
						if (paraTutari>bakiye) {
							System.out.println("bakiye yetersiz!!");
						} else {
							bakiye-=paraTutari;
						}
						break;
					case 2:
						System.out.println("para miktarı: ");
						int paraTutari1=s.nextInt();
						bakiye+=paraTutari1;
						break;
						
					case 3:
						System.out.println("bakiyeniz: "+bakiye);
						break;
					}
					
				} while (secim!=4);
				System.out.println("çıkış yaptınız.");
				break;
				
			} else {
				kalan--;
				if (kalan==0) {
					System.out.println("karınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
				}
				System.out.println("hatalı giris yaptınız tekrar deneyin!");
				System.out.println("kalan giriş hakkı: "+ kalan);
			}
		}
		
	}

}
