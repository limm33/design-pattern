package online.limingming.learned.observer.weather;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
