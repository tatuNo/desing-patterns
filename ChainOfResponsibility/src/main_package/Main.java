package main_package;

public class Main {

	public static void main(String[] args) {
		Pomo esimies = new Esimies();
		Pomo paallikko = new Paallikko();
		Pomo tj = new Toimitusjohtaja();
		esimies.setPomo(paallikko);
		paallikko.setPomo(tj);
		
		Tyontekija tekija = new Tyontekija("Tekijä", 2000);
		esimies.kasittelePalkkapyynto(tekija, 2050);
		System.out.println(tekija.getPalkka());
	}
}
