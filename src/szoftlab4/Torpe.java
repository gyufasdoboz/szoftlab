package szoftlab4;

import java.util.ArrayList;
import java.util.Random;

//Egy speci�lis ellens�gt�pus
public class Torpe extends Ellenseg {

//T�rpe publikus konstruktora
	public Torpe(Ut sajat) {
		super(sajat);
		elet = 200;
		ertek = 140;
	}
	
	//Tick hat�s�ra, a T�rpe bizonyos val�sz�n�s�ggel l�pni fog. (1/5)
	public void tick(){
		
		 Random randomGenerator = new Random();
		 int index = randomGenerator.nextInt(4);
		 
		 
		if(index == 1){
			ArrayList<Ut> lehetsegesutak = sajatUt.lepnek();
			lepek(lehetsegesutak);
		}
		
	}
	
	//Ha l�v�s �ri az ellens�get, akkor a r� vonatkoz� �rt�kkel cs�kken az �lete
	public void sebez(Lovedek lovedek){
		elet = elet - lovedek.sebzesTorpe;
	}

}
