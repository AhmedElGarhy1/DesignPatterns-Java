package StrategyPattern.Duck.FlyStrategies;

public class NoFlyStrategy implements IFlyStrategy {
    @Override
    public void fly() {
        System.out.print("I can't Fly");
    }
}
