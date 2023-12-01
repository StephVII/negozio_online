package org.generation.italy;

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
		
		

	}

}
