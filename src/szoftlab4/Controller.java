package szoftlab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Controller {
	Jatekter jatekter;
	Aktiv aktiv;
	
	public Controller(Jatekter ter){		// A Controller konstruktora
		jatekter = ter;
	}
	
	public void indit(){			//P�lya kiv�laszt�sa, j�t�kos felruh�z�sa var�zser�vel
		Log.log(LogType.CALL, this, "indit()");
		int palyaSzam = 0;
		
		Log.log(LogType.KERDES, null, "H�nyas p�ly�t t�lts�k be? [int]");
		
		try {
		palyaSzam = Integer.parseInt(Log.br.readLine());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		jatekter.betolt(palyaSzam);
		jatekter.felhasznalo.varazserotKap(100);
		startTick();
		
		Log.log(LogType.RETURN, this, "void");
		
	}
	
	public void startTick(){	//Tick ind�t�sa
		Log.log(LogType.CALL, this, "startTick()");
		
		Log.log(LogType.RETURN, this, "void()");
		
	}
	
	public void meghaltam(int ertek){	// A j�t�kos var�zser�t kap
		Log.log(LogType.CALL, this, "meghaltam()");
		
		jatekter.felhasznalo.varazserotKap(ertek);
		
		Log.log(LogType.RETURN, this, "void");	
	}
	
	//F�ggv�ny, aminek megh�v�s�val jelezhetj�k a j�t�k v�g�t. True-t kell neki �tadni, ha a j�t�kos nyert, 
	//false-ot ha a j�t�kos vesztett.
	public void endgame(boolean nyerte){
		
	}

}
