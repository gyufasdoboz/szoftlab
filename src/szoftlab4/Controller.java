package szoftlab4;

import java.util.ArrayList;

public class Controller {
	
	//Az akt�v j�t�kteret tartalmazza
	Jatekter jatekter;
	
	//Az Akt�v elemeket tartalmazza, amelyeknek sz�ks�ge van tick-re.
	ArrayList<Aktiv> aktiv;

	//A Controller oszt�ly konstruktora
	public Controller(Jatekter ter) { 
		jatekter = ter;
		aktiv = new ArrayList<Aktiv>();
	}

	// P�lya kiv�laszt�sa, j�t�kos felruh�z�sa var�zser�vel
	public void indit() { 
		int palyaSzam = 0;
			jatekter.betolt(palyaSzam);
			jatekter.felhasznalo.varazserotKap(100);
			startTick();

	}

	//TODO: Ez nem egy sz�lat fog elind�tani?
	public void startTick() { // Tick ind�t�sa

		for (Aktiv elem : aktiv) {
			elem.tick();
		}

		try {
			wait(500);
		} catch (InterruptedException e) {
			System.err.println("IO Hiba");

			e.printStackTrace();
		}
	}

	//Egy ellens�g hal�la ut�n, a j�t�kos var�zser�t kap
	public void meghaltam(int ertek) { 

		jatekter.felhasznalo.varazserotKap(ertek);

	}

	//Egy akt�v p�lyaelemet hozz�ad az Akt�v list�hoz
	public void addAktiv(Aktiv a) {
		aktiv.add(a);
	}

	// F�ggv�ny, aminek megh�v�s�val jelezhetj�k a j�t�k v�g�t. True-t kell neki
	// �tadni, ha a j�t�kos nyert,
	// false-ot ha a j�t�kos vesztett.
	// TODO: Ez �rtes�ti majd a Game oszt�lyt, ha v�ge a j�t�knak?
	public void endgame(boolean nyerte) {

	}

}
