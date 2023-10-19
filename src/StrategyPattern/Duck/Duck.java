package StrategyPattern.Duck;

import StrategyPattern.Duck.DisplayStratiegies.IDisplayStrategy;
import StrategyPattern.Duck.FlyStrategies.IFlyStrategy;
import StrategyPattern.Duck.QuackStrategies.IQuackStrategy;

public class Duck implements IDuck{
    private final IQuackStrategy quackStrategy;
    private final IDisplayStrategy displayStrategy;
    private final IFlyStrategy flyStrategy;

    public Duck(IQuackStrategy quackStrategy, IFlyStrategy flyStrategy, IDisplayStrategy displayStrategy){
      this.quackStrategy = quackStrategy;
      this.flyStrategy = flyStrategy;
      this.displayStrategy = displayStrategy;
    }

    public void quack(){
        this.quackStrategy.quack();
    }
    public void fly(){
        this.flyStrategy.fly();
    }
    public void display(){
        this.displayStrategy.display();
    }
}
