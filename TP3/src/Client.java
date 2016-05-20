import factory.AbstractFactory;
import factory.ConcreteFactorySalades;
import legumes.AbstractLegumes;

public class Client {

	public static void main(String[] args){
		
		AbstractFactory f = new ConcreteFactorySalades();
		
		AbstractLegumes ls = f.creerLegumes();
		ls.afficher();
		
	}
}
