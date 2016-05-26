package factory;

import herbes.AbstractHerbes;
import herbes.HerbesPotage;
import huiles.AbstractHuiles;
import huiles.HuilesPotage;
import legumes.AbstractLegumes;
import legumes.LegumesPotage;

public class ConcreteFactoryPotage implements AbstractFactory {

	@Override
	public AbstractLegumes creerLegumes() {
		return new LegumesPotage();
	}

	@Override
	public AbstractHerbes creerHerbes() { return new HerbesPotage(); }

	@Override
	public AbstractHuiles creerHuiles() { return new HuilesPotage(); }

}
