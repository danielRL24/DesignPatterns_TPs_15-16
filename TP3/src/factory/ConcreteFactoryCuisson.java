package factory;
import legumes.AbstractLegumes;
import legumes.LegumesCuisson;

public class ConcreteFactoryCuisson implements AbstractFactory {

	@Override
	public AbstractLegumes creerLegumes() {
		return new LegumesCuisson();
	}

}
