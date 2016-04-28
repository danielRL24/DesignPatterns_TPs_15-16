package State;

public class Commande {

	private Statut state;
	
	public Commande() {
		this.state = new StateEnAttente();
	}
	
	public void traiter() {
		state.traiter(this);
	}
	
	public void setState(Statut state) {
		this.state = state;
	}
	
	public static void main(String[] args) {
		Commande c = new Commande();
		c.traiter();
		c.traiter();
		c.traiter();
	}

}
