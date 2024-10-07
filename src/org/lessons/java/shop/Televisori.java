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
		setSmart();
		setCodice();
		setIva();
		
	}
	
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
	
	public boolean setSmart(){
	
	return this.smart;

	}
	
}

