package szoftlab4;

import java.util.ArrayList;

public class Mezo extends Cella {
	private ArrayList<Mezorevalo> rajtamvan;	//Az adott mez�n l�v� elemeket tartalmaz� lista

	public Mezo(ArrayList<Cella> l){
		szomszedok = l;
		rajtamvan = new ArrayList<Mezorevalo>();
	}

	public void ratesz(Mezorevalo elem)			// A Cell�ra tesz mez�reval� elemet 
	{
		rajtamvan.add(elem);
		elem.init(this);
	}

	public void levesz(Mezorevalo elem)			// Cellr�l levesz mez�reval� elemet 
	{
		rajtamvan.remove(elem);
	}

	public boolean mezovagyok()
	{												// igazzal t�r vissza, mert � egy mez�
		return true;
	}

	public ArrayList<Ut> kozelbenvan(int melyseg)	//visszat�r egy minden utat tartalmaz� list�val
	{
		ArrayList<Ut> temp_ut = new ArrayList<Ut>();

		if(melyseg!=0)
		{
			//TODO: rekurz�van vissza kell adni a k�zelben l�v� utakat... a baj az, hogy list�nk csak a cell�kr�l van, nem az utakr�l..			
		}

		return temp_ut;

	}
}