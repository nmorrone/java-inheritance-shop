package org.lessons.java.shop;

public class Televisori extends Prodotto{
	
	
	private int larghezza;
	private int altezza;
	private int profondita;
	boolean smart;
	
	
	public Televisori(String nome, String descrizione, double prezzo){
		
		super(nome, descrizione, prezzo);
		setLarghezza(larghezza);
		setAltezza(altezza);
		setProfondita(profondita);
		setSmart(smart);
		setCodice();
		setIva();
		
	}
	
	//apro metodi getter e setter
	
	public void setAltezza(int a) {
		this.altezza = a;
	}
	
	public int getAltezza() {
		return this.altezza;
	}
	
	public void setLarghezza(int l) {
		this.larghezza = l;
	}
	
	public int getLarghezza() {
		return this.larghezza;
	}
	
	public void setProfondita(int p) {
		this.profondita = p;
	}
	
	public int getProfondita() {
		return this.profondita;
	}
	
	public void setSmart(boolean a){
	this.smart = a;
	}
	
	public boolean getSmart() {
		return this.smart;
	}

	//metodo toString
	public String toStringTv() {
		return String.format("Prodotto: %s Codice Prodotto: %s Descrizione: %s Altezza: %s Larghezza: %s,  Profondità: %s, SmartTV: %s Prezzo(IVA incl.): €%s",
				getNome(), getCodice(), getDescrizione(),getAltezza(), getLarghezza(), getProfondita(), getSmart(), getPrezzoIvato());
		
	}
	
}

