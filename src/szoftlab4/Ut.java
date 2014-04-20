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
		ArrayList<Ut> temp = null;
		// TODO: Ugyan az a helyzet mint a Mezo oszt�ly k�zelbenvan fv-�vel... a  szomsz�dok list�ja Cell�kat t�rol, �gy nem lehet Ut-ra sz�rni.. :(
		return temp;
	}

}