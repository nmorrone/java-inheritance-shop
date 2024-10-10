package org.lessons.java.shop;

public class EsempioWhile {

	
	private void  esempio() {
		int tentativi = 10;
		while (tentativi > 0) {
			System.out.println(tentativi);
			tentativi = tentativi - 1;
		}
		
		tentativi = 10;
		do {
			System.out.println(tentativi);
			tentativi = tentativi - 1;
		}
		while (tentativi > 0);
		
		for (tentativi = 10; tentativi > 0; tentativi--) {
			System.out.println(tentativi);
		}
		
}
	
}
