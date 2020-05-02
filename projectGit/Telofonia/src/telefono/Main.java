package telefono;

import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;
import java.nio.charset.Charset;

public class Main {

	public static void main(String[] args) {
		OperatoreTelefonico primo=OperatoreTelefonico.ILIAD;
		ArrayList<String> prova = new ArrayList<String>();
		//primo.StampaOperatori();
		
		//OperatoreTelefonico.SceltaOperatore();
		/*prova=Sim.inserimentoDati(prova);
		prova=Sim.inserimentoDati(prova);
		prova=Sim.inserimentoDati(prova);
		prova=Sim.inserimentoDati(prova);*/
		//Sim.stampaArrayList(prova);
		
		
		String[] vettoreNumeri= new String[10];
		vettoreNumeri[0]="111111111111";
		vettoreNumeri[1]="222222222222";
		vettoreNumeri[2]="333333333333";
		vettoreNumeri[3]="444444444444";
		vettoreNumeri[4]="555555555555";
		
		vettoreNumeri[5]="666666666666";
		vettoreNumeri[6]="777777777777";
		vettoreNumeri[7]="888888888888";
		vettoreNumeri[8]="999999999999";
		vettoreNumeri[9]="100000000000";
		
		Random r=new Random();
		for(int i=0;i<5;i++) {
			Integer n=r.nextInt(121321321);
			
			
			byte[] array = new byte[7]; // length is bounded by 7
			new Random().nextBytes(array);
			Random rnd = new Random();
			StringBuffer boh = new StringBuffer();
			boh.append("");
			for (int j=0; j<3; j++) {
				int c = rnd.nextInt (122-48)+48;
				if((c>=58 && c<=64)||(c>=91 && c<=96)) {
					j--;
					
					continue;
				
				}
				boh.append((char )c);
				}

				
	

			
			prova.add(boh.toString());
			prova.add(n.toString());
		
			}	
		Sim.stampaArrayList(prova);
		
		
	
		
		//Popolare array stampa e interfacce
		
				
		
		//Sim.chiamateNumero(vettoreNumeri);
		//Sim.shuffleArray(prova);
		//Sim.randomArray(prova);
	

	}

}
