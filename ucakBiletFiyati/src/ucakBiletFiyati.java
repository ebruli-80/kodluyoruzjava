import java.util.Scanner;
public class ucakBiletFiyati {

	public static void main(String[] args) {
		int km,yas,yon;
		double Ntutar,kmBasi=0.10,Yasİndirimi,İtutar,gdİndirim,TTutar;
		Scanner s=new Scanner(System.in);
		System.out.println("Km yi giriniz: ");
		km=s.nextInt();
		System.out.println("Yaşınızı giriniz: ");
		yas=s.nextInt();
		
		Ntutar=km*kmBasi;
		System.out.println("sadece gidiş için 1 ,gidiş dönüş için 2 giriniz: ");
		yon=s.nextInt();
		
		if (km>0 && yas>0 && yon==1)
		{
			if (yas<=12) {
				Yasİndirimi=Ntutar*0.50;
				İtutar=Ntutar-Yasİndirimi;
				System.out.println("toplam tutar: "+İtutar);
			}
			else if (yas>12 && yas<=24) {
				Yasİndirimi=Ntutar*0.10;
				İtutar=Ntutar-Yasİndirimi;
				System.out.println("toplam tutar: "+İtutar);
			}else if(yas>24 && yas<65) {
				System.out.println("toplam tutar: "+Ntutar);
			}else if (yas>65) {
				Yasİndirimi=Ntutar*0.30;
				İtutar=Ntutar-Yasİndirimi;
				System.out.println("toplam tutar: "+İtutar);
			}
			
		}
		else if(km>0 && yas>0 && yon==2)
		{
			if (yas<=12) {
				Yasİndirimi=Ntutar*0.50;
				İtutar=Ntutar-Yasİndirimi;
				gdİndirim=İtutar*0.20;
				TTutar=((İtutar-gdİndirim)*2);
				System.out.println("toplam tutar: "+TTutar);
			}
			else if (yas>12 && yas<=24) {
				Yasİndirimi=Ntutar*0.10;
				İtutar=Ntutar-Yasİndirimi;
				gdİndirim=İtutar*0.20;
				TTutar=((İtutar-gdİndirim)*2);
				System.out.println("toplam tutar: "+TTutar);
			}else if(yas>24 && yas<65) {
				gdİndirim=Ntutar*0.20;
				TTutar=((Ntutar-gdİndirim)*2);
				System.out.println("toplam tutar: "+TTutar);
			}else if (yas>65) {
				Yasİndirimi=Ntutar*0.30;
				İtutar=Ntutar-Yasİndirimi;
				gdİndirim=İtutar*0.20;
				TTutar=((İtutar-gdİndirim)*2);
				System.out.println("toplam tutar: "+TTutar);
			}
			
		}
		else {System.out.println("Hatalı veri girdiniz!!");}
		
		
		
		
		
		
		
		
		/*if (km>0 && yas>0 &&yon==1)
		{
			if (yas<=12) {
				if(yon==2) {
					Yindirimi=Ntutar*0.50;
					İtutar=Ntutar-Yindirimi;
					System.out.println("toplam tutar: "+İtutar);
				}
				}
				
			}
			else if(yas>12 &&yas<25) 
			{
				Yindirimi=Ntutar*0.10;
				İtutar=Ntutar-Yindirimi;
			}
			else if(yas>65) 
			{
				Yindirimi=Ntutar*0.30;
				İtutar=Ntutar-Yindirimi;
			}
	
		}*/
		}
	}		
	


