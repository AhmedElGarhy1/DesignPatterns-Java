package ObserverPattern;

import ObserverPattern.Observable.IWeather;
import ObserverPattern.Observable.WeatherStation;
import ObserverPattern.Observer.ComputerDisplay;
import ObserverPattern.Observer.PhoneDisplay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // define the weatherStation "Observable"
        IWeather weatherStation = new WeatherStation();

        // define the display devices "Observers"
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        ComputerDisplay computerDisplay = new ComputerDisplay();

        // dispatch add observers to consume data
        weatherStation.add(phoneDisplay);
        weatherStation.add(computerDisplay);

        System.out.println("Please Enter the new Temperature to broadcast others");
        for (int i =0; i<5; i++){
            String input = scanner.nextLine();
            int temp = Integer.parseInt(input);
            // update the state to trigger update function in consumers(Observers)
            weatherStation.setTemperature(temp);
        }

        scanner.close();
    }
}