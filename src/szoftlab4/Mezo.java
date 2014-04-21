package szoftlab4;

import java.util.ArrayList;

public class Mezo extends Cella {
	private ArrayList<Mezorevalo> rajtamvan;	//Az adott mez�n l�v� elemeket tartalmaz� lista

	public Mezo(){
		super();								//Megh�vjuk a Cella konstruktor�t is
	}
	public Mezo(ArrayList<Cella> l){
		super();
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

	//Ez a met�dus lehet hogy nagyon lassan fog lefutni. Ha lesz id� �jra kell �rni.
	public ArrayList<Ut> kozelbenvan(int melyseg)	//visszat�r egy minden utat tartalmaz� list�val
	{	
		//Erre a v�ltoz�ra az�rt van sz�ks�g, hogy ne kelljen minden alkalammola v�gigmenni
		//az ArrayList-en. A ciklus csak olyan elemeket fog megn�zni, amiket m�g nem n�zzett meg
		int itttart = 0;
		
		//Ebben t�roljuk az utakat
		ArrayList<Ut> temp_ut = new ArrayList<Ut>();
		
		//A mez� mellett tal�lhat� utakat hozz�adjuk az utakat tartalmaz� list�hoz
		ArrayList<Cella> cellak = getSzomszedok();
		for(int i = 0;i<cellak.size();i++){
			if(cellak.get(i) instanceof Ut){
				temp_ut.add((Ut)cellak.get(i));
			}
		}
		//Ha a m�lys�g csak egy volt, v�gezt�nk.
		melyseg -=1 ;

		
		cellak.clear();
		ArrayList<Cella> cellatemp = new ArrayList<Cella>();
		//Egy�bk�nt pedig v�gigmegy�nk az utakon, �s azok szomsz�dain
		//Ha azok utak, �s m�g nincsenek benne a list�ban, belerakjuk �ket is a list�ba.
		while(melyseg!=0)
		{
			//A legr�gebbi nem meg n�zett elemt�l kezdve, megn�zz�k az elemek szomsz�dait, 
			//Ezekb�l list�t csin�lunk
			for(int i = itttart; i<temp_ut.size();i++){
				cellak = temp_ut.get(i).getSzomszedok();
					for(int j = 0;j<cellak.size();j++){
						cellatemp.add(cellak.get(j));
					}
			}
			
			//V�gigmegy�nk az �gy fel�p�tett list�nkon, �s ha olyan elemet tal�lunk ami �t, �s
			//m�g nincs benne az utakat tartalmaz� list�nkban, hozz�adjuk.
			
			for(int i = 0; i<cellatemp.size();i++){
				if(cellatemp.get(i) instanceof Ut || !temp_ut.contains(cellatemp.get(i)))
				{
					temp_ut.add((Ut)cellak.get(i));
					itttart +=1;
				}
			}
			
			
			cellak.clear();
			cellatemp.clear();
			
			melyseg -= 1;			
		}

		return temp_ut;

	}
}