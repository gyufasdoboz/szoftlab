package szoftlab4;

import java.util.ArrayList;

public class Cella {
	protected ArrayList<Cella> szomszedok;	// Lista a szomsz�d cell�kr�l
	private Boolean boolean1;
	
	public Cella()
	{
		
	}
	
	public Cella(ArrayList<Cella> l){		// A Cella konstruktora
		szomszedok = l;
	}
	
	public void ratesz(Mezorevalo elem) // Cell�ra tesz mez�reval� elemet (itt nem haszn�lt)
	{
		
	}
	
	public void ratesz(Utravalo elem) // Cell�ra tesz �traval� elemet (itt nem haszn�lt)
	{
		
	}
	
	public void levesz(Mezorevalo elem) // Cellr�l levesz mez�reval� elemet (itt nem haszn�lt)
	{
		
	}
	
	public void levesz(Utravalo elem) // Cellr�l levesz �traval� elemet (itt nem haszn�lt)
	{
		
	}
	

	
	public ArrayList<Ellenseg> kivanrajtam() // Visszaad egy Ellens�glist�t azokr�l az ellens�gekr�l akik az adott cell�n(�ton) vannak (itt nem haszn�lt)
	{
		return null;
	}
	
	public ArrayList<Cella> getSzomszedok() // Visszaadja a szomsz�d cell�k list�j�t
	{
		return szomszedok;
	}
	

	public boolean mezovagyok() // igazzal t�r vissza, ha mez�, hamissal ha �t (itt nem haszn�lt)
	{
		boolean1 = (Boolean) null;
		return boolean1;		
	}
	


}
