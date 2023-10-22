package DecoratorPattern.Component;

public abstract class CoffeeCup implements ICoffeeCup{

    @Override
    public String getDescription() {
        return "The Coffee Cup Is a ";
    }

    @Override
    abstract public int cost();
}
