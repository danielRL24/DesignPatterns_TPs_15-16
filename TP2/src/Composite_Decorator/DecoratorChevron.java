package Composite_Decorator;

public class DecoratorChevron extends FruitDecorator {

    /**
     * Constructeur
     * @param f : AbstractFruit à décorer (fruit ou panier)
     */
    public DecoratorChevron(AbstractFruit f) {
        super(f);
    }

    @Override
    public void afficher() {
        System.out.print("<");
        fruit.afficher();
        System.out.print("/");
        if(fruit.contientPeppin())
            System.out.print("Avec Pepin");
        else
            System.out.print("Sans Pepin");
        System.out.print(">");
    }
}
