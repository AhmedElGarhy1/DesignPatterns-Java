package ObserverPattern.Observable;

import ObserverPattern.Observer.IObserver;

public interface IObservable {
    public void add(IObserver observer);
    public void remove(IObserver observer);
    public void _notify();

}
