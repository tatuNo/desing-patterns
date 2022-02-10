
abstract class Tayte implements Pizza {
	protected Pizza p;
	
	public Tayte(Pizza p) {
		this.p = p;
	}
	
	public double getHinta() {
		return p.getHinta();
	}
	
	public String lisaa() {
		return p.lisaa();
	}
}
