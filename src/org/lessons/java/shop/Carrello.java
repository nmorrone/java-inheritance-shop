package org.lessons.java.shop;

import java.util.Scanner;

import org.lessons.java.snacks1.Studente2;

public class Carrello extends Prodotto {

	public Prodotto [] prodotti;

	Carrello(int m) {

		prodotti = new Prodotto[m];
	}
	
	public void setProdotto(Prodotto s, int m) {
		prodotti[m] = s;
	}
	// inizializzazione del carrello

	public static void main(String[] args) {

		System.out.println("Benvenuto nell'inizializzazione del Carrelo \nCominciamo ad inserire i prodotti");

		Scanner input = new Scanner(System.in);

		System.out.println("Quanti prodotti vuoi inserire?");
		int m = input.nextInt();

		Carrello carrello1 = new Carrello(m);

		for (int i = 0; i < m; i++) {
			System.out.println("Che tipo di prodotto vuoi inserire? \n 1 per Smartphone, 2 per Cuffie, 3 per Televisori");
			int scelta = input.nextInt();
			switch (scelta) {
			case 1: {
				int posizione = i;
				System.out.println("Inserisci nome smartphone, descrizione e prezzo \n (valida con invio ogni campo");
				String a = input.nextLine();
				String b = input.nextLine();
				double c = input.nextDouble();
				// String nomeProdotto = "Prodotto" + String.valueOf(i);
				Smartphones smartphone = new Smartphones(a, b, c);
				carrello1.setProdotto(smartphone, posizione);
				break;
			}
			case 2: {
				int posizione = i;
				System.out.println("Inserisci nome cuffie, descrizione e prezzo \n (valida con invio ogni campo");
				String a = input.nextLine();
				String b = input.nextLine();
				double c = input.nextDouble();
				// String nomeProdotto = "Prodotto" + String.valueOf(i);
				Cuffie cuffie = new Cuffie(a, b, c);
				carrello1.setProdotto(cuffie, posizione);
				break;
			}
			case 3: {
				int posizione = i;
				System.out.println("Inserisci nome cuffie, descrizione e prezzo \n (valida con invio ogni campo");
				String a = input.nextLine();
				String b = input.nextLine();
				double c = input.nextDouble();
				// String nomeProdotto = "Prodotto" + String.valueOf(i);
				Televisori televisore = new Televisori(a, b, c);
				carrello1.setProdotto(televisore, posizione);
				break;
			}

			}

		} 
	}
}
