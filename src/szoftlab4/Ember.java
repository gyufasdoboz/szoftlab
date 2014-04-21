package szoftlab4;

import java.util.ArrayList;
import java.util.Random;

public class Ember extends Ellenseg {

	public Ember(Ut sajat) {
		super(sajat);
		elet = 100;
		ertek = 100;
	}

	//Tick hat�s�ra az Ember bizonyos val�sz�n�s�ggel l�pni fog (1/3)
	public void tick(){
		
		 Random randomGenerator = new Random();
		 int index = randomGenerator.nextInt(2);
		 
		 
		if(index == 1){
			ArrayList<Ut> lehetsegesutak = sajatUt.lepnek();
			lepek(lehetsegesutak);
		}
		
	}
	
	//Param�terk�nt kap egy l�ved�ket, �s a r� vonatkoz� �rt�kkel sebzi mag�t
	public void sebez(Lovedek lovedek){
		 elet = elet - lovedek.sebzesEmber;
	}
	
	
}
