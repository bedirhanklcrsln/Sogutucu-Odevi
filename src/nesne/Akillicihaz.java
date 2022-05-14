
package nesne;

import java.util.Scanner;

public class Akillicihaz implements IAkillicihaz
{
	public static boolean klima = false;
	PostgreSQLSurucu sunucu = new PostgreSQLSurucu();
	Ekran ekran = new Ekran();
	Agarayuzu arayuz = new Agarayuzu();
	Uyar� u = new Uyar�();

	Kullanicilar users;
	
	public void basla()
	{
		Scanner veri = new Scanner(System.in);
		acilistesti();
		sunucu.baglan();
		bekleme();
		ekran.mesajGonder("Kullan�c� ad�n�z� ve �ifrenizi giriniz:");
		String usern= veri.nextLine();			
		String sifre = veri.nextLine();
		
		if(sunucu.adDogrula(usern,sifre))
		{
			u.ekle(users);
			arayuz.islemSecimi();
				if(arayuz.secim==4 ) {
				kapali();
			}
		}
		else
		{
			servisdisi();
			return;
		}
		
	}

    @Override
    public boolean kapali() 
    {
        System.out.println("Cihaz Kapal�");
        return true;  
    }

    @Override
    public boolean acilistesti() 
    {
        System.out.println("A��l�� testi yap�l�yor...");
        return true;
    }

    @Override
    public boolean bekleme() 
    {
        System.out.println("Cihaz �u an bekleme durumunda");
        return true;
    }

    @Override
    public boolean algilama()
    {
        System.out.println("Alg�lan�yor...");
        return true;
    }

    @Override
    public boolean servisdisi() 
    {
        System.out.println("Cihaz �u an servis d���");
        return true;  
    }

    @Override
    public boolean islemyapiliyor() 
    {
        System.out.println("��lem yap�l�yor...");
        return true;
    }
    
    
}
