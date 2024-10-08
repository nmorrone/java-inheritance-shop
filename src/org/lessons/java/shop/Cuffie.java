package org.lessons.java.shop;

public class Cuffie extends Prodotto{
	
	private String colore;
	boolean wireless;
	boolean cablate;
	
	
	public Cuffie(String nome, String descrizione, double prezzo){
		
		super(nome, descrizione, prezzo);
		setCodice();
		setIva();
		setWireless(wireless);
		setCablate(cablate);

	}
	
	//apro metodi getter e setter

	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public String getColore() {
		return this.colore;
	}
	
	public void setWireless(boolean a) {
		this.wireless = a;
	}

	public boolean getWireless() {
		return this.wireless;
	}
	
	public void setCablate(boolean b) {
		this.cablate = b;
	}
	
	public boolean getCablate() {
		return this.cablate;
	}
	
	
	//metodo to string
	//override
	public String toString() {
		
		return String.format("Prodotto: %s Codice Prodotto: %s Descrizione: %s Colore: %s Wireless: %s Cablate: %s Prezzo (IVA incl.): €%s",
				getNome(), getCodice(), getDescrizione(),getColore(), getWireless(), getCablate(), getPrezzoIvato());
		
	}
	
}
