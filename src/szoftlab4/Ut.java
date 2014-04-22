package szoftlab4;

import java.util.ArrayList;

public class Ut extends Cella{

	//Tartalmazza azokat az elemeket, amik rajta helyezkednek el
	public ArrayList<Utravalo> rajtamvan;
	
	//Az �ton tal�lhat� akad�ly
	public Akadaly akadaly;
	

	//Ut oszt�ly param�teres konstruktora
	public Ut(ArrayList<Cella> l){
		super(l);
		rajtamvan = new ArrayList<Utravalo>();
	}
	
	//Ut oszt�ly param�ter n�lk�li konstruktora
	public Ut(){
		super();
		rajtamvan = new ArrayList<Utravalo>();
	}

	//Az �tra teszi a megadott elemet
	public void ratesz(Utravalo elem)				
	{	
		rajtamvan.add(elem);
		elem.init(this);
	}

	//Az �tr�l leveszi a param�terk�nt �tadott elemet
	public void levesz(Utravalo elem)				
	{
		rajtamvan.remove(elem);
	}

	//Igazzal t�r vissza, ha mez�, hamissal ha �t
	public boolean mezovagyok()						  	
	{
		return false;								// Mert bizony szeg�ny Cella nem Mez�, hanem �t :'( 
	}
	
	//Visszaadja azokat az ellens�geket, akik rajta helyezkednek el.
	public ArrayList<Ellenseg> kivanrajtam()
	{
		ArrayList<Ellenseg> temp = new ArrayList<Ellenseg>();
		for(int i = 0;i<rajtamvan.size();i++)
		{	if(rajtamvan.get(i) instanceof Ellenseg)
				temp.add((Ellenseg)rajtamvan.get(i));
		}
		return temp;
	}

	//A k�zelben l�v� utak list�j�val t�r vissza, ahov� az ellens�g l�phet
	public ArrayList<Ut> lepnek()					
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