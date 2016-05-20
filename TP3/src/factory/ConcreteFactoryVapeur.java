package factory;
import legumes.AbstractLegumes;
import legumes.LegumesSalade;

public class ConcreteFactoryVapeur implements AbstractFactory {

	@Override
	public AbstractLegumes creerLegumes() {
		return new LegumesSalade();
	}

}
