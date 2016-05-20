package factory;
import legumes.AbstractLegumes;
import legumes.LegumesSalade;

public class ConcreteFactorySalades implements AbstractFactory {

	@Override
	public AbstractLegumes creerLegumes() {
		return new LegumesSalade();
	}

}
