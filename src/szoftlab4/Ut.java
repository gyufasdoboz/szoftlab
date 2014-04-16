package szoftlab4;

import java.util.ArrayList;

public class Ut extends Cella{

	public ArrayList<Utravalo> rajtamvan;
	public Akadaly akadaly;
	ArrayList<Cella> szomszedok;
	
	public Ut(){
		rajtamvan = new ArrayList<Utravalo>();
		szomszedok = new ArrayList<Cella>();
	}
	
	public void ratesz(Utravalo elem)				//Cell�ra tesz �traval� elemet 
	{	
		Log.log(LogType.CALL, this, "ratesz_ut");
		rajtamvan.add(elem);
		Tesztesetek.testUt.levesz(elem);
		Tesztesetek.testEllenseg.SajatUtCsere(this);
		
		elem.init(this);
		
		Log.log(LogType.RETURN, null, "void");
	}
	
	public void levesz(Utravalo elem)				// Cellr�l levesz mez�reval� elemet 
	{
		Log.log(LogType.CALL, this, "levesz_ut");
		rajtamvan.remove(elem);
		Log.log(LogType.RETURN, null, "void");
	}
	
	public boolean mezovagyok()						// Igazzal t�r vissza, ha mez�, hamissal ha �t 	
	{
		Log.log(LogType.CALL, this, "mezovagyok_ut");
		Log.log(LogType.RETURN, null, "boolean");
		return false;
	}
	
	public ArrayList<Ut> lepnek()					// A k�zelben l�v� utak list�j�val t�r vissza
	{
		Log.log(LogType.CALL, this, "lepnek_ut");
		ArrayList<Ut> temp_ut = null;
		for(int i=0;i<this.szomszedok.size();i++)
		{
			if(!this.szomszedok.get(i).mezovagyok())
				temp_ut.add((Ut) this.szomszedok.get(i));
		}
		Log.log(LogType.RETURN, null, "ArrayList<Ut>");
		return temp_ut;
	}

}
