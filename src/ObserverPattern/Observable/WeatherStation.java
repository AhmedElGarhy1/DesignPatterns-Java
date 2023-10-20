package ObserverPattern.Observable;

import ObserverPattern.Observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IWeather{
    private final List<IObserver> observers;
    private int temperature;

    public WeatherStation(){
        this.observers = new ArrayList<IObserver>();
    }
    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void _notify() {
        for (IObserver observer : observers) {
            observer.update(this);
        }
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
        this._notify();
    }
    public int getTemperature(){
        return this.temperature;
    }
}
