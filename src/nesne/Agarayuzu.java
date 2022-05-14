package nesne;

import java.util.Scanner;

public class Agarayuzu 
{
    private final IEyleyicimodul modul;
    private final ISicaklikalgilayici sensor;
    private final IEkran ekran;
    private Uyar� u;
	public  static int secim;
	

	private static final int SICAKLIK_GORUNTULE = 1;
	private static final int SOGUTUCU_AC = 2;
	private static final int SOGUTUCU_KAPAT = 3;
	private static final int UYGULAMA_KAPAT = 4;

	public Agarayuzu() 
	{
		modul=new Eyleyicimodul();
		sensor=new Sicaklikalgilayici();
		ekran = new Ekran();
		}
		
	void islemSecimi(){
		 do{
		 	secim=anaMenuyuGoster();
		 	
			switch (secim) {
				case SICAKLIK_GORUNTULE:
					sensor.sicaklikOku();
					break;
				case SOGUTUCU_AC:
					modul.sogutucuAc();
					break;

				case SOGUTUCU_KAPAT:
					modul.sogutucuKapat();
					break;

				case UYGULAMA_KAPAT:
					ekran.mesajGonder("Cihaz kapat�l�yor...");
		            break;
				
					
				default:
					ekran.mesajGonder("1-4 aras�nda bir say� girmelisiniz");
			}
		}while(secim!=4);
	}

	int anaMenuyuGoster()
	{
		ekran.mesajGonder("**********************************************");
		ekran.mesajGonder("Ana Menu");
		ekran.mesajGonder("1-S�cakl�k G�r�nt�le");
		ekran.mesajGonder("2-So�utucuyu a�");
		ekran.mesajGonder("3-So�utucuyu kapat");
		ekran.mesajGonder("4-��k��");
		ekran.mesajGonder("Seciminiz:");
		ekran.mesajGonder("**********************************************");
		Scanner input=new Scanner(System.in);
        return input.nextInt();
	}
}
