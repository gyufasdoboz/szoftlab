package szoftlab4;

import java.util.ArrayList;

public class Cella {
	
	// Lista amely tartalmazza a szomsz�d cell�kat
	public ArrayList<Cella> szomszedok;	

	//A Cella oszt�ly konstruktora
	public Cella()
	{
		szomszedok = new ArrayList<Cella>();
	}

	//A Cella param�teres konstruktora, amelynek a szomsz�dait kell �tadni
	public Cella(ArrayList<Cella> l){		
		szomszedok = l;
	}

	// Cell�ra tesz mez�reval� elemet. Mezo oszt�lyban fel�l�rva!
	public void ratesz(Mezorevalo elem) 
	{

	}

	//Cell�ra r�tesz egy �traval� elemet. Ut oszt�lyban fel�l�rva!
	public void ratesz(Utravalo elem) 
	{

	}

	// Cellr�l levesz egy mez�reval� elemet. Mezo oszt�lyban fel�l�rva!
	public void levesz(Mezorevalo elem) 
	{

	}

	// Cellr�l levesz egy �traval� elemet. Ut oszt�lyban fel�l�rva!
	public void levesz(Utravalo elem) 
	{

	}

	//Visszaad egy Ellens�glist�t azokr�l az ellens�gekr�l akik az adott cell�n(�ton) vannak. Ut oszt�lyban fel�l�rva!
	public ArrayList<Ellenseg> kivanrajtam() 
	{
		return null;
	}

	//Visszaadja a szomsz�d cell�k list�j�t
	public ArrayList<Cella> getSzomszedok() 
	{
		return szomszedok;
	}

	//Igazzal t�r vissza, ha mez�, hamissal ha �t. Lesz�rmazott oszt�lyokban fel�l�rva.
	public boolean mezovagyok() 
	{
		return false;		
	}



}