package szoftlab4;

public class VegzetHegye implements Utravalo {
	
	//Ez t�rolja hogy melyik cell�n van az objektum
	private Ut sajatUt;
	
	//A VegzetHegye �let�t tartalmazza
	private int elet;
		
	//Konstruktor, ami inicializ�lja az objektumot.
	public VegzetHegye(){
		
		Log.add(this, "VegzetHegye");
		Log.log(LogType.NEW, this, null);
		sajatUt = null;
		elet = 500;
	}
	
	//A torony �let�t lecs�kkkenti a param�terben kapott mennyis�ggel
	//Amennyiben a torony �lete negat�v tartom�nyba esik, megh�vja a meghal() f�ggv�nyt.
	public void sebez(int egyseg){
		Log.log(LogType.CALL, this, "sebez(int egyseg)");
		Log.log(LogType.RETURN, null, "void");	
	}
			
	//Akkor h�v�dik meg, hogyha a torony ereje annyira lecs�kken, hogy a toronynak el kell
	//pusztulnia
	public void meghal(){
		Log.log(LogType.CALL, this, "meghal()");
		Log.log(LogType.RETURN, null, "void");					
	}
	
	
	//Inicializ�lja az oszt�j sajatUt attrib�tum�t, ami tartalmazza hogy az elem
	//melyik cell�n van rajta
	public void init(Ut sajatUt){
		Log.log(LogType.CALL, this, "init(Ut sajatUt)");
		Log.log(LogType.RETURN, null, "void");		
		
	}
}
