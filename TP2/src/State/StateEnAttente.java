package State;

public class StateEnAttente extends Statut {

	@Override
	public void traiter(Commande c) {
		System.out.println("La commande est en attente !");
		c.setState(new StatePayee());
	}
}
