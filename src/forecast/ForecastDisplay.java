package forecast;

public class ForecastDisplay implements DisplayElement, Observer{

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        System.out.print("기상예보 : ");
        if(currentPressure > lastPressure){
            System.out.println("날씨가 좋아지고 있습니다.");
        }else if(currentPressure == lastPressure){
            System.out.println("지금과 비슷할 것 같습니다.");
        }else if(currentPressure < lastPressure){
            System.out.println("쌀쌀하며 비가 올 것 같습니다.");
        }
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}
