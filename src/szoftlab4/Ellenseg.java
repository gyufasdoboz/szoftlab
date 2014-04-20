package szoftlab4;

import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;

public class Ellenseg implements Utravalo, Aktiv {
	
	//Tartalmazza hogy az Elens�g �ppen melyik mez�n van rajta
	private Ut sajatUt;
	
	//Tartalmazza az Ellens�g �let�nek �rt�k�t
	//Lesz�rmazott oszt�lyokban fel�l�rni!
	private int elet;
	
	//Tartalmazza, hogy az Ellens�g hal�la eset�n mennyivel n�vekszik a j�t�kos var�zsereje
	//Lesz�rmazott oszt�lyokban fel�l�rni!
	private int ertek;
	
	//Az Ellens�g oszt�ly konstruktora
	//Lesz�rmazott oszt�lyban fel�l�rni!
	public Ellenseg(Ut sajat){
		sajatUt = sajat;
		elet = 50;
		ertek = 50;
	}
	
	//Ha tick t�rt�nik a rendszerben, ez a f�ggv�ny h�v�dik meg
	//Lesz�rmazott oszt�lyban fel�l�rni!
	public void tick(){
		
	//TODO: Ide kell egy logika, ami megmondja hogy az ellens�g a k�rben l�phet-e, l�pni szeretne.
		if(false){
			ArrayList<Ut> lehetsegesutak = sajatUt.lepnek();
			lepek(lehetsegesutak);
		}
		
	}
	
	//Ha a k�zelben van egy V�gzethegye objektum, ezen f�ggv�ny seg�ts�g�vel t�madja meg azt
	public void tamad(VegzetHegye hegy){

	}
	
	//Ha az ellens�g �letereje null�ra cs�kken, ez a f�ggv�ny h�v�dik meg
	public void meghal(){
			
		sajatUt.levesz(this);
		Game.controller.meghaltam(ertek);
		

	}
	
	//Amikor az Elens�g l�p, ez a f�ggv�ny cser�li le az aktu�lis mez�t, amin �ll
	public void SajatUtCsere(Ut ujUt){
		
	//kicser�lj�k az utunkat az �j �tra
		sajatUt = ujUt;
		
	}
	
	//A torony h�vja meg, amennyiben le akarja l�ni az ellens�get
	//Az aloszt�lyokban fel�l kell �rni, a megfelel� logik�val!!!
	public void sebez(Lovedek lovedek){
		
	}
	
	//Kiv�laszt egy utat ahova l�pni szeretne
	public void lepek(ArrayList<Ut> utak){
		 Random randomGenerator = new Random();
		 int index = randomGenerator.nextInt(utak.size());
         Ut kovetkezout = utak.get(index);
		kovetkezout.ratesz(this);
	}
	
	//A sajatUt attrib�tumot inicializ�lja
	public void init(Ut sajat){
			sajatUt = sajat;
	}

}
