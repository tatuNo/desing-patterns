
public class Charmeleon extends Kehitysmuoto {
	
	private static Charmeleon INSTANCE = null;
	private static final int T = 12;
	private static final int P = 9;
	private static final int L = 6;
	
	private Charmeleon () {}
	
	public static Kehitysmuoto getInstance () {
		if(INSTANCE == null) {
			INSTANCE = new Charmeleon();
		}
		return INSTANCE;
	}

	@Override
	void taistele(Pelihahmo p) {
		System.out.println("Charmeleon taistelee ja ansaitsee " + T + "xp");
		p.setXp(T);
	}

	@Override
	void puolusta(Pelihahmo p) {
		System.out.println("Charmeleon puolustaa ja ansaitsee " + P + "xp");
		p.setXp(P);
	}

	@Override
	void liiku(Pelihahmo p) {
		System.out.println("Charmeleon liikkuu ja ansaitsee " + L + "xp");
		p.setXp(L);
	}
}
