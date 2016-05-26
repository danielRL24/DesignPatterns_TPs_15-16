import factory.*;
import herbes.AbstractHerbes;
import huiles.AbstractHuiles;
import legumes.AbstractLegumes;

public class Client {

	private AbstractFactory f;
	private AbstractLegumes l;
	private AbstractHerbes he;
	private AbstractHuiles hu;

	public static void main(String[] args){
		Client client = new Client();

		client.setFactory(new ConcreteFactoryCuisson());
		client.creerIngredients();

		client.setFactory(new ConcreteFactoryPotage());
		client.creerIngredients();

		client.setFactory(new ConcreteFactorySalade());
		client.creerIngredients();

		client.setFactory(new ConcreteFactoryVapeur());
		client.creerIngredients();
	}

	public void creerIngredients() {
		l = f.creerLegumes();
		he = f.creerHerbes();
		hu = f.creerHuiles();

		System.out.println("-> " + f.getClass().getSimpleName());
		l.afficher();
		he.afficher();
		hu.afficher();
	}

	public  void setFactory(AbstractFactory ff) {
		f = ff;
	}
}
