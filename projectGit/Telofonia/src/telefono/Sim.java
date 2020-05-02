package telefono;

/*Esercizio no.11
E' necessario scrivere una applicazione che simula il funzionamento di un frammento del sistema informativo
 di un operatore di telefonia cellulare.
Si devono quindi rappresentare i dati relativi ad una carta SIM ed in particolare:
- il numero di telefono
- il credito disponibile in euro
- la lista delle telefonate effettuate
Per ciascuna telefonata deve essere rappresentata la durata in minuti
La classe SIM dovrà fornire le seguenti funzionalità:
- un costruttore parametrizzato che crea una SIM con numero di telefono, un credito e la lista delle
   telefonate vuota
- un metodo per l'inserimento di una telefonata con i dati forniti dall'utente.
- una funzione per il calcolo dei minuti totali di conversazione.
- una funzione per il calcolo delle telefonate effettuate verso un certo numero
- una procedura per la stampa dei dati della SIM e l'elenco delle telefonate.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public abstract class Sim {
	private int numeroTelefonico;
	private double credito;
	ArrayList<String> listaTelefonate;
	
	
	//Costruttore
	public Sim(int _numeroTelefonico,double _credito,ArrayList<String> _listaTelefonate) {
		this.numeroTelefonico=_numeroTelefonico;
		this.credito=_credito;
		this.listaTelefonate=_listaTelefonate;
	}


	//Setter e getter
	public int getNumeroTelefonico() {
		return numeroTelefonico;
	}


	public void setNumeroTelefonico(int numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}


	public double getCredito() {
		return credito;
	}


	public void setCredito(double credito) {
		this.credito = credito;
	}


	public ArrayList<String> getListaTelefonate() {
		return listaTelefonate;
	}


	public void setListaTelefonate(ArrayList<String> listaTelefonate) {
		this.listaTelefonate = listaTelefonate;
	}
	
	//un metodo per l'inserimento di una telefonata con i dati forniti dall'utente.
	public static ArrayList<String> inserimentoDati(ArrayList<String> listaTelefonate) {
		
		Scanner mioScanner= new Scanner(System.in);
		System.out.println("Inserisci email e numero telefonico");
		
		listaTelefonate=new ArrayList<String>();
		
		String email=mioScanner.next();
		
		String numeroChiamato=mioScanner.next();
		listaTelefonate.add(email);
		listaTelefonate.add(numeroChiamato);
		return listaTelefonate;
		
		
		//listaTelefonate.forEach(shape->System.out.println(shape));
		
		/* for( String tmp : listaTelefonate )
	           System.out.println(tmp );
		 }/*

		/*for(int i=0;i<listaTelefonate.size();i++) {
			System.out.println(listaTelefonate.get(i));
		}*/
		
		
	}
	
	//una funzione per il calcolo delle telefonate effettuate verso un certo numero
	public static void chiamateNumero(String [] vettore) {
		
		
        Random r=new Random();
        int randomNumber=r.nextInt(vettore.length);
        System.out.println(vettore[randomNumber]);
      
    
	}
	
public static void shuffleArray(ArrayList <String> listaChiamate) {
	
	Collections.shuffle(listaChiamate);
	System.out.println("Elemento random:");
	for(String tmp:listaChiamate) {
		System.out.println(tmp);
		}
}
public static void stampaArrayList(ArrayList<String> listaChiamate) {
	for(int i=0;i<listaChiamate.size();i++) {
		System.out.println(listaChiamate.get(i));
	}
}

public static void randomArray(ArrayList<String> listaChiamate) {
	Random r= new Random();
	
	
	
	
	
}public abstract void  stampaNumero(int numero);
	
}
