
public class Kinkku extends Tayte {
	
	public Kinkku (Pizza p) {
		super(p);
	}

	@Override
	public double getHinta() {
		return super.getHinta() + 1.6;
	}

	@Override
	public String lisaa() {
		return super.lisaa() + "kinkku ";
	}

}
