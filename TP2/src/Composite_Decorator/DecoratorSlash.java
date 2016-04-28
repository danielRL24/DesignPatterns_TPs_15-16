package Composite_Decorator;

public class DecoratorSlash extends FruitDecorator {

    /**
     * Constructeur
     * @param f : AbstractFruit à décorer (fruit ou panier)
     */
    public DecoratorSlash(AbstractFruit f) {
        super(f);
    }

    @Override
    public void afficher() {
        System.out.print("/");
        fruit.afficher();
        System.out.print("/" + fruit.contientPeppin());
        System.out.print("/");
    }
}
