package szoftlab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 *	Protot�pus f�program
 */
public class Application {
	
	/*
	 *	Protot�pus konzolos fel�let�nek parancsai 
	 */
	private static enum Code {
		loadmap, printstate, tick, printpower, printgems, buygem, addtower, addtowergem, 
		addtrapgem, addenemy, addspecialprojectile, addfog, enemydirection, exit, error;
		
		/*
		 *	Param�terk�nt �tadott sztringhez tartoz� k�dsz� visszaad�sa
		 */
	    static Code parseString(String par) {
	        try {
	            return valueOf(par);
	        } catch (IllegalArgumentException ex) {
	            return error;
	        } catch (NullPointerException ex){
	        	return error;
	        }
	    }
	}
	
	public static void main(String[] args){
		try {
			startProto();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void startProto() throws IOException{
		System.out.println("A k�t torony - Protot�pus /datcode/"); 
		System.out.println("");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Mindenkori konzolos bemenetk�nt szolg�l
		boolean exit_flag = false;
		String line = null;
		String[] parancs = null;
		
		try{
		
			while(!exit_flag)
			{
				try {							//A felhaszn�l� v�laszt�s�nak beolvas�sa
					line = br.readLine();
					parancs = line.split(" ");
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
				
				switch(Code.parseString(parancs[0])){
				case loadmap:
					loadmap(parancs);
					break;
				case printstate:
					printstate();
					break;
				case tick:
					tick(parancs);
					break;
				case printpower:
					printpower();
					break;
				case printgems:
					printgems();
					break;
				case buygem:
					buygem(parancs);
					break;
				case addtower:
					addtower(parancs);
					break;
				case addtowergem:
					addtowergem(parancs);
					break;
				case addtrapgem:
					addtrapgem(parancs);
					break;
				case addenemy:
					addenemy(parancs);
					break;
				case addspecialprojectile:
					addspecialprojectile(parancs);
					break;
				case addfog: 
					addfog(parancs);
					break;
				case enemydirection: 
					enemydirection(parancs);
					break;
				case exit:
					exit();
					exit_flag = true;
					break;
				case error:
					System.out.println("Bad command");
					break;
				default:
					break;
				}
			}
		
		} finally{
			if(br != null) br.close();
		}
	}

/*				
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
*/		
	
	public static void loadmap(String args[]){
		if(args[1] != null) Game.jatekter.betolt(args[1]);
		else System.out.println("Invalid parameter");
	}
	public static void printstate(){

	}
	public static void tick(String args[]){

	}
	public static void printpower(){

	}
	public static void printgems(){

	}
	public static void buygem(String args[]){

	}
	public static void addtower(String args[]){

	}
	public static void addtowergem(String args[]){

	} 
	public static void addtrapgem(String args[]){

	}
	public static void addenemy(String args[]){

	}
	public static void addspecialprojectile(String args[]){

	}
	public static void addfog(String args[]){

	}
	public static void enemydirection(String args[]){

	}
	public static void exit(){

	}
	
}
