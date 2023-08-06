import java.util.Scanner;
public class burcBul {

	public static void main(String[] args) {
		int gun,ay;
		Scanner s=new Scanner(System.in);
		System.out.println("kaçıncı ayda doğdunuz: ");
		ay=s.nextInt();
		System.out.println("hangi gün doğdunuz: ");
		gun=s.nextInt();
		if (ay==1) {
			if (gun>=1 && gun<=30) {
				if (gun<22) {
					System.out.println("Oğlak burcusunuz");
				} else {
					System.out.println("Kova burcusunuz.");
				}
			} else {
				 System.out.println("Geçersiz gün girdiniz.");
			}
		}
		
		if (ay==2) {
			if (gun>=1 && gun<=29) {
				if (gun<20) {
					System.out.println("Kova burcusunuz");
				} else {
					System.out.println("Balık burcusunuz.");
				}
			} else {
				 System.out.println("Geçersiz gün girdiniz.");
			}
		}
		
		if (ay==3) {
			if (gun>=1 && gun<=30) {
				if (gun<21) {
					System.out.println("Balık burcusunuz");
				} else {
					System.out.println("Koç burcusunuz.");
				}
			} else {
				 System.out.println("Geçersiz gün girdiniz.");
			}
		}
		
		if (ay==4) {
			if (gun>=1 && gun<=30) {
				if (gun<21) {
					System.out.println("Koç burcusunuz");
				} else {
					System.out.println("Boğa burcusunuz.");
				}
			} else {
				 System.out.println("Geçersiz gün girdiniz.");
			}
		}
		
		if (ay==5) {
			if (gun>=1 && gun<=30) {
				if (gun<22) {
					System.out.println("Boğa burcusunuz");
				} else {
					System.out.println("İkizler burcusunuz.");
				}
			} else {
				 System.out.println("Geçersiz gün girdiniz.");
			}
		}
		
		if (ay==6) {
			if (gun>=1 && gun<=30) {
				if (gun<23) {
					System.out.println("İkizler burcusunuz");
				} else {
					System.out.println("Yengeç burcusunuz.");
				}
			} else {
				 System.out.println("Geçersiz gün girdiniz.");
			}
		}
		
		if (ay==7) {
			if (gun>=1 && gun<=30) {
				if (gun<23) {
					System.out.println("Yengeç burcusunuz");
				} else {
					System.out.println("Aslan burcusunuz.");
				}
			} else {
				 System.out.println("Geçersiz gün girdiniz.");
			}
		}
		
		if (ay==8) {
			if (gun>=1 && gun<=30) {
				if (gun<23) {
					System.out.println("Aslan burcusunuz");
				} else {
					System.out.println("Başak burcusunuz.");
				}
			} else {
				 System.out.println("Geçersiz gün girdiniz.");
			}
		}
		
		if (ay==9) {
			if (gun>=1 && gun<=30) {
				if (gun<23) {
					System.out.println("Başak burcusunuz");
				} else {
					System.out.println("Terazi burcusunuz.");
				}
			} else {
				 System.out.println("Geçersiz gün girdiniz.");
			}
		}
		
		if (ay==10) {
			if (gun>=1 && gun<=30) {
				if (gun<23) {
					System.out.println("Terazi burcusunuz");
				} else {
					System.out.println("Akrep burcusunuz.");
				}
			} else {
				 System.out.println("Geçersiz gün girdiniz.");
			}
		}
		
		if (ay==11) {
			if (gun>=1 && gun<=30) {
				if (gun<22) {
					System.out.println("Akrep burcusunuz");
				} else {
					System.out.println("Yay burcusunuz.");
				}
			} else {
				 System.out.println("Geçersiz gün girdiniz.");
			}
		}
		
		if (ay==12) {
			if (gun>=1 && gun<=30) {
				if (gun<22) {
					System.out.println("Yay burcusunuz");
				} else {
					System.out.println("Oğlak burcusunuz.");
				}
			} else {
				 System.out.println("Geçersiz gün girdiniz.");
			}
		}
		
	}

}
