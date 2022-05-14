
package nesne;

import java.util.Scanner;

public class Akillicihaz implements IAkillicihaz
{
	public static boolean klima = false;
	PostgreSQLSurucu sunucu = new PostgreSQLSurucu();
	Ekran ekran = new Ekran();
	Agarayuzu arayuz = new Agarayuzu();
	Uyarý u = new Uyarý();

	Kullanicilar users;
	
	public void basla()
	{
		Scanner veri = new Scanner(System.in);
		acilistesti();
		sunucu.baglan();
		bekleme();
		ekran.mesajGonder("Kullanýcý adýnýzý ve þifrenizi giriniz:");
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
        System.out.println("Cihaz Kapalý");
        return true;  
    }

    @Override
    public boolean acilistesti() 
    {
        System.out.println("Açýlýþ testi yapýlýyor...");
        return true;
    }

    @Override
    public boolean bekleme() 
    {
        System.out.println("Cihaz þu an bekleme durumunda");
        return true;
    }

    @Override
    public boolean algilama()
    {
        System.out.println("Algýlanýyor...");
        return true;
    }

    @Override
    public boolean servisdisi() 
    {
        System.out.println("Cihaz þu an servis dýþý");
        return true;  
    }

    @Override
    public boolean islemyapiliyor() 
    {
        System.out.println("Ýþlem yapýlýyor...");
        return true;
    }
    
    
}
