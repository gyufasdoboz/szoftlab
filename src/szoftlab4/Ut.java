package szoftlab4;

import java.util.ArrayList;

public class Ut extends Cella{

	public ArrayList<Utravalo> rajtamvan;
	public Akadaly akadaly;
	ArrayList<Cella> szomszedok;

	public Ut(ArrayList<Cella> l){
		rajtamvan = new ArrayList<Utravalo>();
		szomszedok = l;
	}
	public Ut(){
		rajtamvan = new ArrayList<Utravalo>();
	}

	public void ratesz(Utravalo elem)				//Cell�ra tesz �traval� elemet 
	{	
		rajtamvan.add(elem);
		elem.init(this);
	}

	public void levesz(Utravalo elem)				// Cellr�l levesz mez�reval� elemet 
	{
		rajtamvan.remove(elem);
	}

	public boolean mezovagyok()						// Igazzal t�r vissza, ha mez�, hamissal ha �t 	
	{
		return false;								// Mert bizony szeg�ny Cella nem Mez�, hanem �t :'( 
	}

	public ArrayList<Ut> lepnek()					// A k�zelben l�v� utak list�j�val t�r vissza
	{
		ArrayList<Ut> temp = new ArrayList<Ut>();
		ArrayList<Cella> cellak = getSzomszedok();
		for(int i = 0; i<cellak.size();i++){
			if(cellak.get(i) instanceof Ut)
				temp.add((Ut)cellak.get(i));
		}
		return temp;
	}

}