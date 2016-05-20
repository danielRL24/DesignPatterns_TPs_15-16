package factory;
import legumes.AbstractLegumes;
import legumes.LegumesPotage;

public class ConcreteFactoryPotage implements AbstractFactory {

	@Override
	public AbstractLegumes creerLegumes() {
		return new LegumesPotage();
	}

}
