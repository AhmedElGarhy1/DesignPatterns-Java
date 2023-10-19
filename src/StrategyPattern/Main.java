package StrategyPattern;

import StrategyPattern.Duck.DisplayStratiegies.DefaultDisplayStrategy;
import StrategyPattern.Duck.DisplayStratiegies.IDisplayStrategy;
import StrategyPattern.Duck.Duck;
import StrategyPattern.Duck.FlyStrategies.IFlyStrategy;
import StrategyPattern.Duck.FlyStrategies.NoFlyStrategy;
import StrategyPattern.Duck.QuackStrategies.IQuackStrategy;
import StrategyPattern.Duck.QuackStrategies.LoudQuackStrategy;

public class Main {
    public static void main(String[] args){
        IDisplayStrategy ds = new DefaultDisplayStrategy();
        IQuackStrategy qs = new LoudQuackStrategy();
        IFlyStrategy fs = new NoFlyStrategy();
        Duck duck = new Duck(qs, fs,ds);
        duck.quack();
        duck.fly();
    }
}