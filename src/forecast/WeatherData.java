package forecast;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObservers(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObservers(Observer o) {
        observerList.remove(o);

    }

    @Override
    public void notifyObservers() {
        for(Observer o : observerList){
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChange(){
        notifyObservers();
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChange();
    }
    
    
}
