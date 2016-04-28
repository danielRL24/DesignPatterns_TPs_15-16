package Composite_Decorator;

public class DecoratorChevron extends FruitDecorator {

    public DecoratorChevron(AbstractFruit f) {
        super(f);
    }

    @Override
    public void afficher() {
        System.out.print("<");
        fruit.afficher();
        System.out.print("/" + fruit.contientPeppin());
        System.out.print(">");
    }
}
