package nesne;

public class SogutucuAc  implements Actions{
private final IEkran ekran = new Ekran();	
	
   @Override
    public void action() 
    {
    	if(!Akillicihaz.klima) {
    	Akillicihaz.klima=true;
        PostgreSQLSurucu.user1.update(Akillicihaz.klima);
    	}
    	else {
    		ekran.mesajGonder("Soðutucu Zaten Açýk");
    	}
    }

}
