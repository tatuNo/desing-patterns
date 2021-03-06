
public class Charizard extends Kehitysmuoto {
	
	private static Charizard INSTANCE = null;
	private static final int T = 16;
	private static final int P = 13;
	private static final int L = 10;
	
	private Charizard () {}
	
	public static Kehitysmuoto getInstance () {
		if(INSTANCE == null) {
			INSTANCE = new Charizard();
		}
		return INSTANCE;
	}

	@Override
	void taistele(Pelihahmo p) {
		System.out.println("Charizard taistelee ja ansaitsee " + T + "xp");
		p.setXp(T);
	}

	@Override
	void puolusta(Pelihahmo p) {
		System.out.println("Charizard puolustautuu ja ansaitsee " + P + "xp");
		p.setXp(P);
	}

	@Override
	void liiku(Pelihahmo p) {
		System.out.println("Charizard liikkuu ja ansaitsee " + L + "xp");
		p.setXp(L);
	}
}
