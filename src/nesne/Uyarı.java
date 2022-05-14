package nesne;

import java.util.ArrayList;
import java.util.List;

public  class Uyar� implements IUyar�{
	
	private boolean klima;

	
	private List<Observer> subs = new ArrayList<>();
	 
	
	@Override
	public void ekle(Observer sub) {
			subs.add(sub);
	}


	@Override
	public void uyari(String notify) {
			for(Observer sub: subs) {
				sub.update(klima);
			}
		
	}
	
	
		
}
