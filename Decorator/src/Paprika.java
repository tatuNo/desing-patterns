
public class Paprika extends Tayte{
	
	public Paprika (Pizza p) {
		super(p);
	}
	
	@Override
	public double getHinta() {
		return super.getHinta() + 0.6;
	}

	@Override
	public String lisaa() {
		return super.lisaa() + "paprika ";
	}

}
