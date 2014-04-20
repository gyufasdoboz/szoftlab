package szoftlab4;

import java.io.IOException;
import java.util.ArrayList;

//Torony oszt�ly
public class Torony implements Aktiv, Mezorevalo {
		private Mezo sajatMezo;
		private int hatotav;
		private int tuzgyak;
		private int sebzes;
		private int counter;
		ArrayList<Toronykovek> kovek;
	
//Torony publikus konstruktora
		Torony(){
			hatotav=1;
			tuzgyak=10;
			sebzes=1;
			counter = 0;
			kovek = new ArrayList<Toronykovek>();
			sajatMezo = new Mezo();
		}
//Ha t�rt�nik a rendszerben egy tick(), ez a met�dus h�v�dik meg	
//TODO: Jelenleg nincs implement�lva, hogy a k�vek f�ggv�ny�ben v�ltozzon a t�zel�s gyakoris�ga
		public void tick(){
			if(counter >= tuzgyak){
				tuzel();
				counter = 0;
			}
				counter++;
			
		}
//L�trehoz egy l�ved�ket, amit egy ellens�gnek �tadva, sebezz�k azt	
//TODO: Nincs implement�lva az, hogy a k�vekt�l f�ggj�n az elk�sz�lt l�ved�k tulajdons�ga
		private Lovedek createLovedek(){
			
			Lovedek lov = new Lovedek();
			
			return lov;
		}
		
//Amennyiben a tick() megh�vja, a torony t�zelni fog. El�sz�r l�trehoz egy l�ved�ket, majd
//�tadja azt a sebezni k�v�nt ellens�gnek.
		public void tuzel() {
			
			ArrayList<Ellenseg> ellen = lekerdez(hatotav);
			Lovedek lov = createLovedek();
			
			for(int i = 0;i<ellen.size();i++){
				ellen.get(i).sebez(lov);
			}
			
		}
		
//Lek�rdezi a k�zelben(hat�t�von bel�l) tal�lhat� ellens�geket. Ezek ut�n visszadja azt.
		public ArrayList<Ellenseg> lekerdez(int melyseg){
			
			ArrayList<Ut> utak = sajatMezo.kozelbenvan(melyseg);
			ArrayList<Ellenseg> ellen = new ArrayList<Ellenseg>();
			
			for(int i = 0;i<utak.size();i++){
				ArrayList<Ellenseg> rajta = utak.get(i).kivanrajtam();
				if(rajta != null){
					for(int j = 0; j<rajta.size();j++){
						ellen.add(rajta.get(j));
					}
				}
			}
			
			return ellen;
		}
		
//Felszereli a tornyot a param�terk�t kapott k�vel
		public void addKo(Toronykovek ko){
			kovek.add(ko);
		}
		
//Inicializ�lja a mez�t, amint a torony �ll
		public void init(Mezo testMezo) {
			sajatMezo = testMezo;
		}
}