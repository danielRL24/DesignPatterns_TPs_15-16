package factory;
import herbes.AbstractHerbes;
import huiles.AbstractHuiles;
import legumes.AbstractLegumes;
import legumes.LegumesSalade;

public class ConcreteFactorySalades implements AbstractFactory {

	@Override
	public AbstractLegumes creerLegumes() {
		return new LegumesSalade();
	}

	@Override
	public AbstractHerbes creerHerbes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractHuiles creerHuiles() {
		// TODO Auto-generated method stub
		return null;
	}

}
