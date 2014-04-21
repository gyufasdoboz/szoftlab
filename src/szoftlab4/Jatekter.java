package szoftlab4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Jatekter {

	//A j�t�kt�r cell�it tartalmazza
	private ArrayList<ArrayList<Cella>> cellak;
	
	//Az aktu�lis j�t�kost tartalmazza
	public Jatekos felhasznalo;

	//A Jatekter oszt�ly konstruktora. Param�terk�nt egy j�t�kost v�r.
	public Jatekter(Jatekos user) {
		felhasznalo = user;
		cellak = new ArrayList<ArrayList<Cella>>();
	}

	//Egy p�lya bet�lt�s�re val� f�ggv�ny. P�lyasz�mot v�r.
	public void betolt(int palyaSzam) {

	}

	//Egy p�lya bet�lt�s�re val� f�ggv�ny. A p�ly�t tartalmaz� f�jl nev�t v�rja.
	public void betolt(String filename) {

		BufferedReader br = null;
		try {
			System.out.println(System.getProperty("user.dir"));
			br = new BufferedReader(new FileReader(filename));

			String line = br.readLine();

			//Az els� sorb�l beolvassa a p�lya m�reteit
			//TODO: Akkor is m�k�dik, hogyha k�tsz�mjegy� a p�lya m�rete?
			int sizeI = Character.getNumericValue(line.charAt(0));
			int sizeJ = Character.getNumericValue(line.charAt(2));
			line = br.readLine();

			int currentLineNumber = 0;

			//Olvassa a f�jlb�l a p�lya sorait
			//TODO: V�gzethegye, power, szomsz�dok be�ll�t�sa
			while (line != null) {

				cellak.add(new ArrayList<Cella>());

				for (int k = 0; k < line.length(); k++) {
					if (line.charAt(k) == 'M') {
						cellak.get(currentLineNumber).add(new Mezo());
					} else if (line.charAt(k) == 'U') {
						cellak.get(currentLineNumber).add(new Ut());
					} else
						break;
				}
				currentLineNumber++;
				line = br.readLine();
			}

			// ellen�rz�s
			/*
			 * for (int i = 0; i < sizeI; i++){ for (int j = 0; j < sizeJ; j++)
			 * if (cellak.get(i).get(j).getClass().equals(Mezo.class))
			 * System.out.print("M"); else System.out.print("U");
			 * System.out.println(); }
			 */

		} catch (IOException e) {
			System.err.println("IO Hiba");
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.err.println("IO Hiba");
			}
		}

	}

	public int getAr(String koTipus) {

		int ar = 0;

		return ar;
	}
}
