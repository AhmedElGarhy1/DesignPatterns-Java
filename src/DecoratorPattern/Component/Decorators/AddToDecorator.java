package DecoratorPattern.Component.Decorators;

import DecoratorPattern.Component.CoffeeCup;

public abstract class AddToDecorator extends CoffeeCup {

    protected final CoffeeCup coffeeCup;

    public AddToDecorator(CoffeeCup coffeeCup){
        this.coffeeCup = coffeeCup;
    }

    @Override
    abstract public int cost();
}
