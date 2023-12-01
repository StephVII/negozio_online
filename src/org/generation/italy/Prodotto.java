package org.generation.italy;

class Prodotto {
	
	/* 1. Inserimento prodotti: un menù di scelta che consenta di inserire i dati di 
		un nuovo prodotto all'interno del negozio. Ogni prodotto è caratterizzato da
			- codice (stringa): codice identificativo del prodotto (primary key)
			- descrizione (stringa)
			- prezzo (float)
			- sconto (int): percentuale di sconto applicabile ai prodotti (di default 0%)
			- quantità disponibile (int)
	 
	 */
	
	private String codice, descrizione;
	private float prezzo, sconto;
	private int quantità_disp;
	
	//costruttore della classe Prodotto
	public Prodotto(String codice, String descrizione, float prezzo, int quantità_disp) {
		
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.sconto = 0;
		this.quantità_disp = quantità_disp;
	}
	
	
	
	
	public String getCodice() {
		return codice;
	}


	public void setCodice(String codice) {
		if(!codice.isEmpty())
			this.codice = codice;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		if(!descrizione.isEmpty())
			this.descrizione = descrizione;
	}


	public float getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(float prezzo) {
		if(prezzo>0)
			this.prezzo = prezzo;
	}


	public float getSconto() {
		return sconto;
	}


	public void setSconto(float sconto) {
		if(sconto>0 && sconto<100)
			this.sconto = sconto;
	}


	public int getQuantità_disp() {
		return quantità_disp;
	}


	public void setQuantità_disp(int quantità_disp) {
		if(quantità_disp>0)
			this.quantità_disp = quantità_disp;
	}
	
	
	
	

}
