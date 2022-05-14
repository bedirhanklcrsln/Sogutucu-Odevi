package nesne;
import java.util.Random;

public class Sicaklikalgilayici implements ISicaklikalgilayici 
{	
    @Override
    public void sicaklikOku()
    {
        Random rand = new Random();
        int rastgele = rand.nextInt(50);
        System.out.println("Sýcaklýk:" + rastgele);   
    }
    
    
}
