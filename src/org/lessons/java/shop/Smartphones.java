package org.lessons.java.shop;

public class Smartphones extends Prodotto{

	private String codiceImei;
	int memoria;
	
	
	public Smartphones(String nome, String descrizione, double prezzo){
		
		super(nome, descrizione, prezzo);
		setCodice();
		setIva();
		setImei(codiceImei);
		setMemoria(memoria);
		
	}
	
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
}


