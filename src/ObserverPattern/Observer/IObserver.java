package ObserverPattern.Observer;

import ObserverPattern.Observable.IObservable;
import ObserverPattern.Observable.IWeather;

public interface IObserver {
    public void update(IWeather weather);
}
