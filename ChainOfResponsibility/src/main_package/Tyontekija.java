package main_package;

public class Tyontekija {
	
	private String pyytaja;
	private int palkka;
	
	public Tyontekija (String pyytaja, int palkka) {
		this.palkka = palkka;
		this.pyytaja = pyytaja;
	}
	
	public int getPalkka() {
		return palkka;
	}
	public void setPalkka(int palkka) {
		this.palkka = palkka;
	}
	public String getPyytaja() {
		return pyytaja;
	}
	public void setPyytaja(String pyytaja) {
		this.pyytaja = pyytaja;
	}
}
