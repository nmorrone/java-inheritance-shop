package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;
	
	Prodotto(){
		
		setCodice();
		setNome(nome);
		setDescrizione(descrizione);
		setIva();
	}
	
	Prodotto(String nome, String descrizione, double prezzo){
		setCodice();
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		setIva();
	}
	
	
	//apro metodi getter e setter
	
	protected void setCodice() {
		Random code = new Random();
		this.codice = code.nextInt(1 + 100000);
	}
	
	public int getCodice() {
	return this.codice;
	}
	
	public void setNome(String nome) {
	this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setDescrizione(String descrizione) {
	this.descrizione = descrizione;
	}
	
	public String getDescrizione() {
		return this.descrizione;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
		}
		
	public double getPrezzo() {
			return this.prezzo;
	}
	protected void setIva() {
		this.iva = (this.prezzo * 22) / 100;
		}
		
	public double getIva() {
			return this.iva;
	}
	
	public String getPrezzoIvato() {
		return String.format("%.2f", (this.prezzo + this.iva));
	}
	
	//metodo toString
	
	public String toString() {
		
		return String.format("Prodotto: %s Codice Prodotto: %s Descrizione: %s Prezzo (IVA incl.): €%s", getNome(), getCodice(), getDescrizione(), getPrezzoIvato());
		
	}
	
		
}

