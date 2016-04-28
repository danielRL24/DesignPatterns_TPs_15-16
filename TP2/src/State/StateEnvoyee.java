
public class StateEnvoyee extends Statut {

	@Override
	public void traiter(Commande c) {
		System.out.println("La commande a bien été envoyée !");
	}
}
