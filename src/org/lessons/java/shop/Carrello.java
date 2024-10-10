package org.lessons.java.shop;

import java.util.Scanner;


public class Carrello extends Prodotto{
	
	private String nomeCarrello;

	public Prodotto [] prodotti;

	Carrello(String nomeCarrello, int numeroProdotti) {
		
		this.nomeCarrello = nomeCarrello;
		prodotti = new Prodotto[numeroProdotti];
	}
	
	public void setProdotto(Prodotto s, int numeroProdotti) {
		prodotti[numeroProdotti] = s;
	}
	
	//metodo stampa carrello
	public void stampaCarrello() {
		System.out.println(nomeCarrello);
		for(int i = 0; i < prodotti.length; i++){
			System.out.println(prodotti[i].toString() + "\n");
		}
	}

	public static void main(String[] args) {

		System.out.println("Benvenuto inserisci il nome del carrello \n");

		Scanner input = new Scanner(System.in);
		String nomeCarrello = input.nextLine();
		System.out.println("Quanti prodotti vuoi inserire?");
		int m = input.nextInt();
	
		
		Carrello carrello1 = new Carrello(nomeCarrello, m);
;

		for (int i = 0; i < carrello1.prodotti.length; i++) {
			System.out.println("Che tipo di prodotto vuoi inserire? \n 1 per Smartphone, 2 per Cuffie, 3 per Televisori");
			int scelta = input.nextInt();

			if (scelta == 1) {
				int posizione = i;
				System.out.println("Inserisci nome smartphone nome, descrizione e prezzo");
				String a = input.nextLine();
				//risolvo buffer nextline salta chiamata
				input.nextLine();
				String b = input.nextLine();;
				double c = input.nextDouble();
				Smartphones smartphone = new Smartphones(a, b, c);
				// String nomeProdotto = "Prodotto" + String.valueOf(i);
				carrello1.setProdotto(smartphone, posizione);
				System.out.println(smartphone.toString());
			}
			
			else if (scelta == 2) {
				int posizione = i;
				System.out.println("Inserisci nome cuffie, descrizione e prezzo \n (valida con invio ogni campo");
				String a = input.nextLine();
				//risolvo buffer nextline salta chiamata
				input.nextLine();
				String b = input.nextLine();
				double c = input.nextDouble();
				Cuffie cuffie = new Cuffie(a, b, c);
				// String nomeProdotto = "Prodotto" + String.valueOf(i);
				carrello1.setProdotto(cuffie, posizione);
			}
			
			else if (scelta == 3) {
				int posizione = i;
				System.out.println("Inserisci nome televisore, descrizione e prezzo \n (valida con invio ogni campo");
				String a = input.nextLine();
				//risolvo buffer nextline salta chiamata
				input.nextLine();
				String b = input.nextLine();
				double c = input.nextDouble();
				Televisori televisore = new Televisori(a, b, c);
				// String nomeProdotto = "Prodotto" + String.valueOf(i);
				carrello1.setProdotto(televisore, posizione);
			}
			
			else {
				System.out.println("il numero inserito non è associato a nessuna scelta");
				i = 0;
			}

		} 
		
		carrello1.stampaCarrello();
	}
}
