package DecoratorPattern;

import DecoratorPattern.Component.CoffeeCup;
import DecoratorPattern.Component.Decorators.AddCaramelDecorator;
import DecoratorPattern.Component.Decorators.AddChocolateDecorator;
import DecoratorPattern.Component.EspressoCup;
import DecoratorPattern.Component.IceCoffeeCup;

public class Main {
    public static void main(String[] args){
        CoffeeCup espressoCup = new EspressoCup();
        CoffeeCup iceCoffeeCup = new IceCoffeeCup();

//        lets add caramel to iceCoffee cup
        CoffeeCup caramelIceCoffeeCup = new AddCaramelDecorator(iceCoffeeCup);
//        lets add Chocolate to espresso cup
        CoffeeCup chocolateEspressoCup= new AddChocolateDecorator(espressoCup);

//        now we can add another decorator to the decorators
        CoffeeCup doubleCaramelIceCoffeeCup = new AddCaramelDecorator(caramelIceCoffeeCup);

        System.out.println(chocolateEspressoCup.getDescription());
        System.out.println("The Price is " + chocolateEspressoCup.cost());

        System.out.println(doubleCaramelIceCoffeeCup.getDescription());
        System.out.println("The Price is " + doubleCaramelIceCoffeeCup.cost());
    }
}