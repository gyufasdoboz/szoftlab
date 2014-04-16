package szoftlab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Akadaly implements Utravalo {
	
	//Attrib�tum annak a t�rol�s�ra, hogy az Akad�ly melyik Ut-on �ll
	private Ut sajatUt;
	
	//Tartalmazza, hogy mekkora m�rt�kben lass�tja az ellenfelet.
	private int lassitas;
	
	//Amennyiben a torony fel van szerelve k�vel, ennek az �rt�ke nem null.
	private Lilavarazsko ko;
	
	//Az Akad�ly oszt�ly publikus konstruktora
	public Akadaly(){
		sajatUt = null;
		lassitas = 0;
		ko = null;
	}
	
	//F�ggv�ny ami visszaadja, hogy az adott k�rben l�phet-e az Ellens�g
	public boolean lephete(){
		Log.log(LogType.CALL, this, "lephete()");
		
		Log.log(LogType.KERDES, null, "L�phet? [true/false]");
		// Szkeleton miatt ELEJE
		
		Log.br = new BufferedReader(new InputStreamReader(System.in));
		String s= "";
		boolean valasz = false;
		try {
			s = Log.br.readLine();
			if (s.equals("true")) valasz = true;	// Ha true akkor megv�ltoztatja a v�lasz �rt�k�t logikai igazra.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		Log.log(LogType.RETURN, null, s);	
		return valasz;
	}
	
	//Inicializ�lja a sajatUt attrib�tumot
	public void init(Ut sajatUt){
		Log.log(LogType.CALL, this, "init(Ut sajatUt)");
		Log.log(LogType.RETURN, null, "void");
	}
	
	//Lilavar�zsk�vet hozz�adja az akad�lyhoz. A fejleszt�s sor�n h�v�dik meg
	public void addko(Lilavarazsko varazsko){
		Log.log(LogType.CALL, this, "addko()");
		ko = varazsko;
		Log.log(LogType.RETURN, this, "void");
	}
	

}
