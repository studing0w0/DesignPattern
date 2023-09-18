package forecast;

public class CurrentConditionDisplay implements DisplayElement, Observer{
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObservers(this);
    }
    @Override
    public void display() {
        System.out.println("현재 상태 온도 : "+temperature + "F, 습도 : "+humidity + "%");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
