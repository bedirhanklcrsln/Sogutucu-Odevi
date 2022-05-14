
package nesne;


public class Eyleyicimodul implements IEyleyicimodul
{
    private final IEkran ekran = new Ekran();	
	
    @Override
    public void sogutucuAc() 
    {
    	SogutucuAc klimaAc = new SogutucuAc();
    	klimaAc.action();
    }

    @Override
    public void sogutucuKapat() 
    {
    	SogutucuKapat klimaKapat = new SogutucuKapat();
    	klimaKapat.action();
    }
    
}
