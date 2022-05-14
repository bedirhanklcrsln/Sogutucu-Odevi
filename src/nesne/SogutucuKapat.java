package nesne;

public class SogutucuKapat implements Actions {
	
    private final IEkran ekran = new Ekran();	

	@Override
	public void action() 
    {
    	if(Akillicihaz.klima) {
    	Akillicihaz.klima=false;
        PostgreSQLSurucu.user1.update(Akillicihaz.klima);  
    	}
    	else {
    		ekran.mesajGonder("Soðutucu Zaten Kapalý");
    	}
    }
    
}

