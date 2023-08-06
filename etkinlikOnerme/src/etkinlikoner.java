import java.util.Scanner;
public class etkinlikoner {

	public static void main(String[] args) {
		int Sicaklik;
		Scanner s=new Scanner(System.in);
		System.out.println("Sıcaklık değeri giriniz: ");
		Sicaklik= s.nextInt();
		if (Sicaklik<5) {
			System.out.println("Kayağa gidebilirsiniz.");
		} else if(Sicaklik<15){
			System.out.println("Sinemaya gidebilirsiniz");
		}else if(Sicaklik<25) {
			System.out.println("Pikniğe gidebilirsiniz.");
		}else {
			System.out.println("Yüzmeye gidebilirsiniz.");
		}

	}

}
