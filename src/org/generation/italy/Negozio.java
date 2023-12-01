package org.generation.italy;
import java.util.ArrayList;
import java.util.Scanner;

public class Negozio {
	Scanner sc = new Scanner(System.in);
	
	private ArrayList<Prodotto> lista_prodotti;
	private ArrayList<Prodotto> carrello;
	
	public Negozio() {
		
		lista_prodotti = new ArrayList<>();
		carrello = new ArrayList<>();
	}
	
	public void Inserimento_prod(String codice, String descrizione, float prezzo, int quantità_disp) {
		
		Prodotto prod_inserito = new Prodotto(codice, descrizione, prezzo, quantità_disp);
		lista_prodotti.add(prod_inserito);
		System.out.println("L'oggetto "+prod_inserito.getCodice()+" è stato inserito correttamente alla lista dei prodotti.");
	}
	
	public void Elenco_prod() {
		System.out.println("Elenco prodotti: ");
		
		for(Prodotto prod : lista_prodotti)
		{
			System.out.println("\n\nCodice: "+prod.getCodice()+"\nDescrizione: "+prod.getDescrizione()
								+"\nPrezzo: €"+prod.getPrezzo()+"\nSconto: "+prod.getSconto()+"%\nQuantità: "+prod.getQuantità_disp());
		}
	}
	
	public void Applica_sconto(float sconto, String codice_prod) {
		
		for(Prodotto prod : lista_prodotti)
		{
			if(prod.getCodice().equals(codice_prod))
				prod.setSconto(sconto);
			return;
		}
		System.out.println("Prodotto non trovato.");
	}
	
	public void Vendita_prod() {
		Elenco_prod();
		
		System.out.print("Inserire il prodotto che si vuole acquistare: ");
		String prodotto_scelto = sc.nextLine();
		
		for(Prodotto prod : lista_prodotti)
		{
			if(prod.getDescrizione().equals(prodotto_scelto))
			{
				System.out.print("Inserire le unità desiderate: ");
				int unità = Integer.parseInt(sc.nextLine());
				if(unità <= prod.getQuantità_disp())
					
			}
		}
			
		
		
		
	}

}
