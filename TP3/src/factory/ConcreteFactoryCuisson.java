package factory;

import herbes.AbstractHerbes;
import herbes.HerbesCuisson;
import huiles.AbstractHuiles;
import huiles.HuilesCuisson;
import legumes.AbstractLegumes;
import legumes.LegumesCuisson;

public class ConcreteFactoryCuisson implements AbstractFactory {

	@Override
	public AbstractLegumes creerLegumes() { return new LegumesCuisson(); }

	@Override
	public AbstractHerbes creerHerbes() { return new HerbesCuisson(); }

	@Override
	public AbstractHuiles creerHuiles() { return new HuilesCuisson(); }

}
