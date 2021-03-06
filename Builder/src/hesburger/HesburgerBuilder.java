package hesburger;

import hampurilaisbuilder.HampurilaisBuilder;
/**
 * Hesburger builder
 * @author tatu_
 *
 */
public class HesburgerBuilder implements HampurilaisBuilder {
	/** Comment */
	private transient MegaHampurilainen hampurilainen;

	@Override
	public void luoUusiHampurilainen() {
		hampurilainen = new MegaHampurilainen();
	}

	@Override
	public void lisaaSampylat() {
		hampurilainen.setSampyla("muhkea sämpylä");
	}

	@Override
	public void lisaaSalaatti() {
		hampurilainen.setSalaatti("jäävuorisalaatti");
	}

	@Override
	public void lisaaPihvit() {
		hampurilainen.setPihvi("kaksi muhkeaa pihviä");
	}

	@Override
	public void lisaaMajoneesi() {
		hampurilainen.setMajoneesi("paprika- ja kurkkumajoneesi");
	}

	@Override
	public void lisaaJuusto() {
		hampurilainen.setJuusto("cheddarjuusto");
	}

	@Override
	public MegaHampurilainen getHampurilainen() {
		return hampurilainen;
	}
}
