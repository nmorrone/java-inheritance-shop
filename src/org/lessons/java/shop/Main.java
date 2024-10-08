package org.lessons.java.shop;

public class Main {
	
	
public static void main(String[]args) {
	
	Prodotto prodotto1 = new Prodotto();
	prodotto1.setNome("Playstation 5");
	prodotto1.setDescrizione("Console videogiochi di ultima generazione");
	prodotto1.setPrezzo(499.99);
	prodotto1.setIva();
	
	System.out.println(prodotto1.toString());
	
	Cuffie airpods = new Cuffie("airpods", "cuffie professionali di ultima generazione", 349.00);
	airpods.setWireless(true);
	airpods.setColore("Bianco");
	System.out.println(airpods.toString());
	
	Televisori televisore = new Televisori("Samsung Smart TV","Nuova televisione di ultima generazione", 699.00);
	televisore.setLarghezza(135);
	televisore.setAltezza(80);
	televisore.setProfondita(5);
	televisore.setSmart(true);
	System.out.println(televisore.toString());
	
	Smartphones smartphone = new Smartphones("iPhone 13 Pro", "Con nuova fotocamera grandangolare e intelligenza AI", 1199.00);
	smartphone.setImei("049922294271648930");
	smartphone.setMemoria(5120);
	System.out.println(smartphone.toString())
;	
}

}
