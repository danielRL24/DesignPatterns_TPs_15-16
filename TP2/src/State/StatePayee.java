
public class StatePayee extends Statut {
	
	@Override
	public void traiter(Commande c) {
		System.out.println("La commande a bien été payée !");
		c.setState(new StateEnvoyee());
	}
}
