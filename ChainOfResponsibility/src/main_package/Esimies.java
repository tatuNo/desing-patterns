package main_package;

public class Esimies extends Pomo {
	
	private static final double RAJA = 1.02;
	
	@Override
	public void kasittelePalkkapyynto(Tyontekija t, int uusiPalkka) {
		if(uusiPalkka / (double) t.getPalkka() > RAJA) {
			System.out.println("Esimies siirtää pyynnön eteenpäin");
			super.kasittelePalkkapyynto(t, uusiPalkka);
		} else if(uusiPalkka / (double) t.getPalkka() > 1 && uusiPalkka / (double) t.getPalkka() <= RAJA ) {
			System.out.println("Esimies hyväksyy pyynnön");
			t.setPalkka(uusiPalkka);
		} else {
			System.out.println("Palkan alennus? Noh sopii.");
			t.setPalkka(uusiPalkka);
		}
	}

}
