package org.lessons.java.shop;

public class Main {
	
	
public static void main(String[]args) {
	
	Cuffie airpods = new Cuffie("airpods", "cuffie professionali wireless", 349.00);

	System.out.println(airpods.getCodice());
	System.out.println(airpods.getIva());
	
	
	Prodotto prodotto1 = new Prodotto();
	prodotto1.setNome("Playstation 5");
	prodotto1.setDescrizione("Console videogiochi di ultima generazione");
	prodotto1.setPrezzo(499.99);
	prodotto1.setIva();
	
	System.out.println(prodotto1.toString());
	
}

}
