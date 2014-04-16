package szoftlab4;

import java.util.ArrayList;

public class Cella {
	private ArrayList<Cella> szomszedok;	// Lista a szomsz�d cell�kr�l
	
	
	public Cella(){		// A Cella konstruktora
		szomszedok = new ArrayList<Cella>();
		szomszedok.add(Tesztesetek.testUt);
	}
	
	public void ratesz(Mezorevalo elem) // Cell�ra tesz mez�reval� elemet (itt nem haszn�lt)
	{
		Log.log(LogType.CALL, this, "ratesz_mezore");
		
		Log.log(LogType.RETURN, null, "void");
	}
	
	public void ratesz(Utravalo elem) // Cell�ra tesz �traval� elemet (itt nem haszn�lt)
	{
		Log.log(LogType.CALL, this, "ratesz_utra");
		
		Log.log(LogType.RETURN, null, "void");
	}
	
	public void levesz(Mezorevalo elem) // Cellr�l levesz mez�reval� elemet (itt nem haszn�lt)
	{
		Log.log(LogType.CALL, this, "levesz");
		
		Log.log(LogType.RETURN, null, "levesz");
	}
	
	public void levesz(Utravalo elem) // Cellr�l levesz �traval� elemet (itt nem haszn�lt)
	{
		Log.log(LogType.CALL, this, "levesz");
		
		Log.log(LogType.RETURN, null, "levesz");
	}
	

	
	public ArrayList<Ellenseg> kivanrajtam() // Visszaad egy Ellens�glist�t azokr�l az ellens�gekr�l akik az adott cell�n(�ton) vannak (itt nem haszn�lt)
	{
		Log.log(LogType.CALL, this, "kivanrajtam");
		
		Log.log(LogType.RETURN, null, "ArrayList<Ellenseg>");
		return null;
	}
	
	public ArrayList<Cella> getSzomszedok() // Visszaadja a szomsz�d cell�k list�j�t
	{
		Log.log(LogType.CALL, this, "getSzomszedok");
		
		Log.log(LogType.RETURN, null, "ArrayList<Cella>");
		return szomszedok;
	}
	

	public boolean mezovagyok() // igazzal t�r vissza, ha mez�, hamissal ha �t (itt nem haszn�lt)
	{
		Log.log(LogType.CALL, this, "mezovagyok");
		Log.log(LogType.RETURN, null, "boolean");
		return (Boolean) null;
		
	}
	


}
