package factory;

import herbes.AbstractHerbes;
import herbes.HerbesVapeur;
import huiles.AbstractHuiles;
import huiles.HuilesVapeur;
import legumes.AbstractLegumes;
import legumes.LegumesVapeur;

public class ConcreteFactoryVapeur implements AbstractFactory {

	@Override
	public AbstractLegumes creerLegumes() {
		return new LegumesVapeur();
	}

	@Override
	public AbstractHerbes creerHerbes() { return new HerbesVapeur(); }

	@Override
	public AbstractHuiles creerHuiles() { return new HuilesVapeur(); }
}
