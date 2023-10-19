package StrategyPattern.Duck.DisplayStratiegies;

public class DefaultDisplayStrategy implements IDisplayStrategy{
    @Override
    public void display() {
        System.out.println("Default Display");
    }
}
