package szoftlab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//Szkeleton f�program
public class Application {
	
	public static void main(String[] args){
		
		System.out.println("A k�t torony - Szkeleton /datcode/"); 
		System.out.println("");
		
		Log.br = new BufferedReader(new InputStreamReader(System.in)); // Mindenkori konzolos bemenetk�nt szolg�l
		int eset = 0;
		
		while(eset != 11)
		{
			Log.clearAll(); 			// A lehets�ges tesztesetek felsorol�sa
		
			System.out.println("V�lassz tesztesetet!");
			System.out.println("");
		
			System.out.println("[1]  - �j j�t�k ind�t�sa");
			System.out.println("[2]  - Ellens�g l�p�se");
			System.out.println("[3]  - Ellens�g sz�let�se");
			System.out.println("[4]  - Torony elhelyez�se");
			System.out.println("[5]  - Akad�ly elhelyez�se");
			System.out.println("[6]  - Torony t�zel�se");
			System.out.println("[7]  - Torony fejleszt�se");
			System.out.println("[8]  - Akad�ly fejleszt�se");
			System.out.println("[9]  - K� v�s�rl�sa");
			System.out.println("[10] - Ellens�g meghal, J�t�kos var�zser�t kap");
			System.out.println("[11] - Kil�p�s");

			
			
			try {							//A felhaszn�l� v�laszt�s�nak beolvas�sa
				eset = Integer.parseInt(Log.br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
			

			
		if(eset > 0 && eset < 11){
		System.out.println();
		System.out.println("--Teszteset indul --");
		}
		Tesztesetek test = new Tesztesetek();
		test.inicializalas();
		
		switch(eset){						// Ha megfelel�en v�laszt, v�grehajt�dik az adott programr�szlet
		case 1: test.ujjatek(); break;
		case 2: test.ellenseglep(); break;
		case 3: test.ellensegszuletik(); break;
		case 4: test.toronyelhelyez(); break;
		case 5: test.akadalyelhelyez(); break;
		case 6: test.toronytuzel(); break;
		case 7: test.toronyfejleszt(); break;
		case 8: test.akadalyfejleszt(); break;
		case 9: test.kovasarol(); break;
		case 10: test.ellensegmeghal(); break;
		case 11: System.out.println("Kil�p�s"); break;
		default: System.out.println("Nincs ilyen parancs!");
		}
		
		if(eset > 0 && eset < 11){
		System.out.println();
		System.out.println("--Teszteset v�ge --");
		System.out.println();
		}	
	}

		try {
			Log.br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

}
