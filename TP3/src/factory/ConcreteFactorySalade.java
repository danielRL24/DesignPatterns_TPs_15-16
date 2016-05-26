package factory;

import herbes.AbstractHerbes;
import herbes.HerbesSalade;
import huiles.AbstractHuiles;
import huiles.HuilesSalade;
import legumes.AbstractLegumes;
import legumes.LegumesSalade;

public class ConcreteFactorySalade implements AbstractFactory {

	@Override
	public AbstractLegumes creerLegumes() {
		return new LegumesSalade();
	}

	@Override
	public AbstractHerbes creerHerbes() { return new HerbesSalade(); }

	@Override
	public AbstractHuiles creerHuiles() { return new HuilesSalade(); }
}
