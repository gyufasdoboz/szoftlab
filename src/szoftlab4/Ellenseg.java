package szoftlab4;

import java.io.IOException;
import java.util.ArrayList;

public class Ellenseg implements Utravalo, Aktiv {
	
	//Tartalmazza hogy az Elens�g �ppen melyik mez�n van rajta
	private Ut sajatUt;
	
	//Tartalmazza az Ellens�g �let�nek �rt�k�t
	private int elet;
	
	//Tartalmazza, hogy az Ellens�g hal�la eset�n mennyivel n�vekszik a j�t�kos var�zsereje
	private int ertek;
	
	//Az Ellens�g oszt�ly konstruktora
	public Ellenseg(Ut sajat){
		sajatUt = sajat;
		elet = 50;
		ertek = 50;
	}
	
	//Ha tick t�rt�nik a rendszerben, ez a f�ggv�ny h�v�dik meg
	public void tick(){
		Log.log(LogType.CALL, this, "tick()");
		
		Tesztesetek.testUt.lepnek();
		
		Log.log(LogType.KERDES, null, "Tal�lt-e utat amire l�phet? [true/false]");
		String s= "";
		boolean valasz = false;
		try {
			s = Log.br.readLine();
			if (s.equals("true")) valasz = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (valasz == true){
			lepek(null);
		}
		
		
		Log.log(LogType.RETURN, null, "void");
	}
	
	//Ha a k�zelben van egy V�gzethegye objektum, ezen f�ggv�ny seg�ts�g�vel t�madja meg azt
	public void tamad(VegzetHegye hegy){
		Log.log(LogType.CALL, this, "tamad(VegzetHegye()");
		Log.log(LogType.RETURN, null, "void");
	}
	
	//Ha az ellens�g �letereje null�ra cs�kken, ez a f�ggv�ny h�v�dik meg
	public void meghal(){
		Log.log(LogType.CALL, this, "meghal()");
		
		sajatUt.levesz(this);
		Tesztesetek.testController.meghaltam(ertek);
		
		Log.log(LogType.RETURN, null, "void");
	}
	
	//Amikor az Elens�g l�p, ez a f�ggv�ny cser�li le az aktu�lis mez�t, amin �ll
	public void SajatUtCsere(Ut ujUt){
		Log.log(LogType.CALL, this, "SajatUtCsere(Ut ujUt)");
		Log.log(LogType.RETURN, null, "void");
	}
	
	//A torony h�vja meg, amennyiben le akarja l�ni az ellens�get
	public void sebez(Lovedek lovedek){
		Log.log(LogType.CALL, this, "sebez(Lovedek lovedek)");
		boolean meghal = false;
		String meghalstring = null;
		
		Log.log(LogType.KERDES, null, "Meghaljon? [true/false]");
		try {
			meghalstring = Log.br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(meghalstring.matches("true"))
			meghal();
		
		Log.log(LogType.RETURN, null, "void");
	}
	
	//Kiv�laszt egy Ut-at ahova l�pni szeretne
	public void lepek(ArrayList<Ut> utak){
		Log.log(LogType.CALL, this, "lepek(ArrayList<Ut> utak)");
		Tesztesetek.testKovetkezoUt.ratesz(this);
		Log.log(LogType.RETURN, null, "void");
	}
	
	//A sajatUt attrib�tumot inicializ�lja
	public void init(Ut sajatUt){
		Log.log(LogType.CALL, this, "init(Ut sajatUt)");
		Log.log(LogType.RETURN, null, "void");
	}

}
