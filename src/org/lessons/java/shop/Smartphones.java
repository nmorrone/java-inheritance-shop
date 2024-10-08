package org.lessons.java.shop;

public class Smartphones extends Prodotto{

	private String codiceImei;
	private int memoria;
	
	
	public Smartphones(String nome, String descrizione, double prezzo){
		
		super(nome, descrizione, prezzo);
		setCodice();
		setIva();
		setImei(codiceImei);
		setMemoria(memoria);
		
	}
	
	//apro metodi getter e setter
	
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	public int getMemoria() {
		return this.memoria;
	}
	
	public void setImei(String imei) {
		this.codiceImei = imei;
	}
	
	public String getImei() {
		return this.codiceImei;
	}
	
	
	//metodo toString
	public String toString() {
		
		return String.format("Prodotto: %s Codice Prodotto: %s Descrizione: %s Codice IMEI: %s Memoria (gb): %s Prezzo(IVA incl.): €%s",
				getNome(), getCodice(), getDescrizione(),getImei(), getMemoria(), getPrezzoIvato());
		
	}
}


