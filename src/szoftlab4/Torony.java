package szoftlab4;

import java.io.IOException;
import java.util.ArrayList;

//Torony oszt�ly
public class Torony implements Aktiv, Mezorevalo {
		private Mezo sajatMezo;
		private int hatotav;
		private int tuzgyak;
		private int sebzes;
		ArrayList<Toronykovek> kovek;
	
//Torony publikus konstruktora
		Torony(){
			hatotav=1;
			tuzgyak=1;
			sebzes=1;
			kovek = new ArrayList<Toronykovek>();
			sajatMezo = new Mezo();
		}
//Ha t�rt�nik a rendszerben egy tick(), ez a met�dus h�v�dik meg	
		public void tick(){
			Log.log(LogType.CALL, this, "tick()");
			
			Log.log(LogType.KERDES, null, "L�j�n most a torony? [true/false]");
			
			String inS = null;
			try {
				inS = Log.br.readLine();
				if(inS.equals("true")) tuzel();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			Log.log(LogType.RETURN, null, "tick()");
		}
//L�trehoz egy l�ved�ket, amit egy ellens�gnek �tadva, sebezz�k azt		
		private Lovedek createLovedek(){
			Log.log(LogType.CALL, this, "createLovedek()");
			
			Lovedek lov = new Lovedek();
			Log.add(lov, "lovedek");
			
			Log.log(LogType.RETURN, Log.map.get(lov), "createLovedek()");
			return lov;
		}
//Amennyiben a tick() megh�vja, a torony t�zelni fog. El�sz�r l�trehoz egy l�ved�ket, majd
//�tadja azt a sebezni k�v�nt ellens�gnek.
		public void tuzel() throws NumberFormatException, IOException{
			Log.log(LogType.CALL, this, "tuzel()");
			
			ArrayList<Ellenseg> ellen = lekerdez(1);
			Lovedek lov = createLovedek();
			
			Tesztesetek.testEllenseg.sebez(lov);
			
			Log.log(LogType.RETURN, null, "tuzel()");
		}
		
//Lek�rdezi a k�zelben l�v� ellens�geket. Ezek ut�n visszadja azt.
		public ArrayList<Ellenseg> lekerdez(int melyseg){
			Log.log(LogType.CALL, this, "lekerdez()");
			
			ArrayList<Ut> utak = sajatMezo.kozelbenvan(melyseg);
			ArrayList<Ellenseg> ellen = new ArrayList<Ellenseg>();
			
			Log.log(LogType.KERDES, null, "Van ellens�g az utakon? [true/false]");
			try {
				if((Log.br.readLine()).equals("true")) return null;
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			Log.log(LogType.RETURN, Log.map.get(Tesztesetek.testEllenseg), "lekerdez()");
			return ellen;
		}
		
//Felszereli a tornyot a param�terk�t kapott k�vel
		public void addKo(Toronykovek ko){
			Log.log(LogType.CALL, this, "addKo()");
			kovek.add(ko);
			Log.log(LogType.RETURN, null, "addKo()");
		}
		
//Inicializ�lja a mez�t, amint a torony �ll
		public void init(Mezo testMezo) {
			Log.log(LogType.CALL, this, "init()");
			sajatMezo = testMezo;
			Log.log(LogType.RETURN, null, "init()");
		}
}