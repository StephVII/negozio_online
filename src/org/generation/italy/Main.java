package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Scrivere un programma che simula il funzionamento di un negozio online
		Le funzionalità da realizzare sono:
		
		1. Inserimento prodotti: un menù di scelta che consenta di inserire i dati di 
		un nuovo prodotto all'interno del negozio. Ogni prodotto è caratterizzato da
			- codice (stringa): codice identificativo del prodotto (primary key)
			- descrizione (stringa)
			- prezzo (float)
			- sconto (int): percentuale di sconto applicabile ai prodotti (di default 0%)
			- quantità disponibile (int)
		
		2. Elenco prodotti: vengono visualizzate le informazioni
		
		3. Applica sconto: si inserisce il codice di un prodotto e la % di sconto da applicare
		
		4. Vendita prodotti: si chiede all'utente di scegliere un prodotto dall'elenco inserendo
		un codice:
			- vengono visualizzate le informazioni del prodotto per ogni prodotto scelto
			- viene chiesto il prodotto che si vuole acquistare
			- viene chiesta la quantità da acquistare
			- se la quantità disponibile è sufficiente il prodotto viene aggiunto al carrello
			- viene visualizzato il carrello attuale
			- viene chiesto se si vuole aggiungere un altro prodotto al carrello
				Negativo: Si mostra il costo totale e si aggiornano le quantità disponibili
				Positivo: Si ripete il processo di inserimento del prodotto
				
		Esempio prodotto:
		
		- Codice: TS002
		- Descrizione: "T-Shirt Nirvana"
		- Prezzo: 25
		- Sconto: 10
		- Quantità disponibile: 5
		
		
		
		Output dell'acquisto:
		
		inserisci codice del prodotto: TS002
		Stai acquistando: T-Shirt Nirvana
		
		Prezzo originale: €25
		Sconto: 10%
		
		Prezzo scontato: €22,50
		Unità acquistate: 3
		
		Classi:
		- Main
		- Prodotto
		- Carrello
		- Negozio
		
		*/
		Scanner sc = new Scanner(System.in);
		
		int scelta_op;
		boolean check = true;
		
		Negozio Nike = new Negozio();
		
//		Nike.Inserimento_prod("001", "Maglia", 30, 0, 5);
//		Nike.Inserimento_prod("002", "Pantaloni", 35, 0, 15);
//		Nike.Inserimento_prod("003", "Giacca", 40, 0, 10);
		
		System.out.println("Benvenuto nel negozio online.");
		while(check)
		{
			System.out.println("\nQuale operazione vuoi effettuare? \n [1] - Inserimento prodotto \n [2] - Mostra lista prodotti \n [3] - Inserisci nel carrello "
								+ "\n [4] - Mostra carrello \n [5] - Acquista \n [6] - Esci");
			System.out.print("Opzione: ");
			scelta_op = Integer.parseInt(sc.nextLine());
			
			switch(scelta_op) {
			case 1:
				Nike.Inserimento_prod(null, null, 0, 0, 0);
				break;
			
			case 2:
				Nike.Elenco_prod();
				break;
			
			case 3:
				Nike.Vendita_prod();
				break;
				
			case 4:
				Nike.Lista_carrello();
				break;
			case 5:
				System.out.print("\nIl costo totale dell'ordine è: €");
				Nike.Costo();
				break;
			case 6:
				check = false;
			default:
				System.out.println("Operazione scelta non valida.");
				break;
				
			}
			
		}
		
		
	}

}
