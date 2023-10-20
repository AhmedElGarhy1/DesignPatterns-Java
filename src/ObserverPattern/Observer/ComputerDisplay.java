package ObserverPattern.Observer;

import ObserverPattern.Observable.IWeather;

public class ComputerDisplay implements IDisplay, IObserver {
    private int temperature;
    @Override
    public void display() {
        System.out.println("ComputerDisplay had observe the temperature: " + temperature);
    }


    @Override
    public void update(IWeather weather) {
        this.temperature = weather.getTemperature();
        this.display();
    }
}
