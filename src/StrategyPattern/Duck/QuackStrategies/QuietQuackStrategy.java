package StrategyPattern.Duck.QuackStrategies;

public class QuietQuackStrategy implements IQuackStrategy{
    @Override
    public void quack() {
        System.out.println("Quiet Quack");
    }
}
