package nesne;

public class Kullanicilar implements Observer
{
	private String kullanici_adi;
    private String kullanici_parola;

    Kullanicilar(String kullanici_adi, String kullanici_parola) {
    	//super();
        this.kullanici_adi = kullanici_adi;
        this.kullanici_parola = kullanici_parola;
    }

    public String getParola() {
        return kullanici_parola;
    }

    public void setParola(String kullanici_parola) {
        this.kullanici_parola = kullanici_parola;
    }

    public String getAd() {
        return kullanici_adi;
    }

    public void setAd(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }
    
    @Override
    public void update(boolean klima) {
    			System.out.println(" Sogutucu "+(klima ? "Acildi" : "Kapatildi"));
    	
    }

}
