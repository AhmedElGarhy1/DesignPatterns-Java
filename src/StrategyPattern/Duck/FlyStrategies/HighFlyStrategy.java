package StrategyPattern.Duck.FlyStrategies;

public class HighFlyStrategy implements IFlyStrategy{
    @Override
    public void fly() {
        System.out.println("High Fly");
    }
}
