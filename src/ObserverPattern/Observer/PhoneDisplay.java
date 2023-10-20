package ObserverPattern.Observer;

import ObserverPattern.Observable.IWeather;

public class PhoneDisplay  implements IDisplay, IObserver {
    private int temperature;
    @Override
    public void display() {
        System.out.println("PhoneDisplay had observe the temperature: " + temperature);
    }
    @Override
    public void update(IWeather weather) {
        this.temperature = weather.getTemperature();
        this.display();
    }
}

