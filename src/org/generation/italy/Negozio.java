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
	
	public void Inserimento_prod(String codice, String descrizione, float prezzo, float sconto, int quantità_disp) {
		System.out.print("Inserimento del prodotto: \nCodice: ");
		codice = sc.nextLine();
		System.out.print("\nDescrizione: ");
		descrizione = sc.nextLine();
		System.out.print("\nCosto: ");
		prezzo = Float.parseFloat(sc.nextLine());
		System.out.print("\nQuantità disponibile: ");
		quantità_disp = Integer.parseInt(sc.nextLine());
		System.out.print("\nSconto applicato: ");
		sconto = Float.parseFloat(sc.nextLine());
		
		if(sconto > 0)
		{
			//Applica_sconto(sconto, codice);
			prezzo = prezzo-(prezzo*(sconto/100));
		}
		
		Prodotto prod_inserito = new Prodotto(codice, descrizione, prezzo, sconto, quantità_disp);
		lista_prodotti.add(prod_inserito);
		System.out.println("L'oggetto "+prod_inserito.getCodice()+" è stato inserito correttamente alla lista dei prodotti.");
	}
	
	public void Elenco_prod() {
		System.out.println("\nElenco prodotti: ");
		
		for(Prodotto prod : lista_prodotti)
		{
			System.out.println("\nCodice: \t\t"+prod.getCodice()+"\nDescrizione: \t\t"+prod.getDescrizione()
								+"\nPrezzo: \t\t€"+prod.getPrezzo()+"\nSconto: \t\t"+prod.getSconto()+"%\nQuantità: \t\t"+prod.getQuantità_disp());
		}
	}
	
//	public void Applica_sconto(float sconto, String codice_prod) {
//		
//		for(Prodotto prod : lista_prodotti)
//		{
//			if(prod.getCodice().equals(codice_prod))
//				prod.setSconto(sconto);
//			return;
//		}
//	}
	
	public void Vendita_prod() {
		Elenco_prod();
		
		System.out.print("\nInserire il prodotto che si vuole acquistare: ");
		String prodotto_scelto = sc.nextLine();
		
		for(Prodotto prod : lista_prodotti)
		{
			if(prod.getDescrizione().equals(prodotto_scelto))
			{
				System.out.print("Inserire le unità desiderate: ");
				float unità = Float.parseFloat(sc.nextLine());
				if(unità <= prod.getQuantità_disp())
				{
					prod.setQuantità_disp(unità);
					prod.setUnità_acquistate(unità);
					carrello.add(prod);
					System.out.println("Prodotto aggiunto correttamente al carrello.");
				}
				else
					System.out.println("Quantità disponibile non sufficiente;");
				return;
			}	
		}
		System.out.println("Prodotto non trovato.");
		
	}
	
	public void Lista_carrello() {
		
		System.out.println("Il carrello attuale contiene: ");
		
		for(Prodotto prod : carrello)
		{
			System.out.println("\n\nCodice: \t\t"+prod.getCodice()+"\nDescrizione: \t\t"+prod.getDescrizione()
								+"\nPrezzo: \t\t€"+prod.getPrezzo()+"\nSconto: \t\t"+prod.getSconto()+"%\nQuantità: \t\t"+prod.getUnità_acquistate());
		}
	}
	
	public void Costo() {
		float costo_tot = 0;
		for(Prodotto prod : carrello)
		{
			 costo_tot += prod.getPrezzo()*prod.getUnità_acquistate();
			 prod.setUnità_acquistate(0);
		}
		
		System.out.println(costo_tot);
	}

}
