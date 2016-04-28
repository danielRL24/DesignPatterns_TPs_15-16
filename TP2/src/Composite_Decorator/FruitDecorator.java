package Composite_Decorator;

public abstract class FruitDecorator implements AbstractFruit{
    protected final AbstractFruit fruit;

    /**
     * Constructeur
     * @param f : AbstractFruit à décorer (fruit ou panier)
     */
    public FruitDecorator(AbstractFruit f) {
        fruit = f;
    }

    @Override
    public boolean contientPeppin() {
        return fruit.contientPeppin();
    }
}
