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
	
	public void tick(){
		
		 Random randomGenerator = new Random();
		 int index = randomGenerator.nextInt(4);
		 
		 
		if(index == 1){
			ArrayList<Ut> lehetsegesutak = sajatUt.lepnek();
			lepek(lehetsegesutak);
		}
		
	}
	
	public void sebez(Lovedek lovedek){
		elet = elet - lovedek.sebzesTorpe;
	}

}
