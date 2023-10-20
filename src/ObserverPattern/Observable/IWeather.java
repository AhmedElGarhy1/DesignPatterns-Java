package ObserverPattern.Observable;

public interface IWeather extends IObservable{
    public int getTemperature();
    public void setTemperature(int temperature);
}
