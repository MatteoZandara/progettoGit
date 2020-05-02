package telefono;
import java.util.Scanner;

public enum OperatoreTelefonico {
	TIM(10,"T"),
	VODAFONE(15,"V"),
	WIND(20,"W"),
	TRE(25,"3"),
	ILIAD(30,"I");
	public int tariffa;
	public String simbolo;
	
	private OperatoreTelefonico(int _tariffa,String string) {
		this.tariffa=_tariffa;
		this.simbolo=string;
		}

	
	//Getter e setter
	public int getTariffa() {
		return tariffa;
	}

	public void setTariffa(int tariffa) {
		this.tariffa = tariffa;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	
	public void StampaOperatori() {
		for(OperatoreTelefonico tmp :OperatoreTelefonico.values()) {
			System.out.println(tmp.name() +" "+ tmp.tariffa+" " + tmp.simbolo);
		}
			}

	public static void SceltaOperatore()  throws IllegalArgumentException{
		
		
		Scanner mioScanner= new Scanner(System.in);
		System.out.println("Inserisci un numero tra 1 e 5 per scegliere l'operatore");
		
			int scelta=mioScanner.nextInt();
			
			if(scelta<1 || scelta>5) {
				
				throw new IllegalArgumentException("Valore non consentito");
			}
			
	
		
		switch(scelta) {
		case 1:System.out.println(TIM.name()+ "\nTariffa: "+TIM.getTariffa()+"\nSimbolo: "+TIM.getSimbolo());
		break;
		case 2:System.out.println(VODAFONE.name()+"\nTariffa: "+ +VODAFONE.getTariffa()+"\nSimbolo: "+TIM.getSimbolo());
		break;
		case 3:System.out.println(WIND.name()+"\nTariffa: "+ +WIND.getTariffa()+"\nSimbolo: "+WIND.getSimbolo());
		break;
		case 4:System.out.println(TRE.name()+"\nTariffa: "+ +TRE.getTariffa()+"\nSimbolo: "+TRE.getSimbolo());
		break;
		case 5:System.out.println(ILIAD.name()+"\nTariffa: "+ +ILIAD.getTariffa()+"\nSimbolo: "+ILIAD.getSimbolo());
		break;
		}
		
		
		
	
	}
	
}
