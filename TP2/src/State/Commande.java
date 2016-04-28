package State;

public class Commande {

	private Statut state;

	/**
	 * Constructeur
	 */
	public Commande() {
		this.state = new StateEnAttente();
	}

	/**
	 * Traitement
	 */
	public void traiter() {
		state.traiter(this);
	}

	/**
	 * Changement d'état
	 * @param state : état
     */
	public void setState(Statut state) {
		this.state = state;
	}

	/**
	 * MAIN
	 * @param args
     */
	public static void main(String[] args) {
		Commande c = new Commande();
		c.traiter();
		c.traiter();
		c.traiter();
	}

}
