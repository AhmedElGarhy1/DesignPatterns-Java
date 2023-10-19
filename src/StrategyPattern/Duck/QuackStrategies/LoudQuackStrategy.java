package StrategyPattern.Duck.QuackStrategies;

public class LoudQuackStrategy implements IQuackStrategy {

    @Override
    public void quack() {
        System.out.println("Loud Quack");
    }
}
