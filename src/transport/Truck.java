package transport;

public class Truck extends Transport implements Competing {
    public Truck(String brand, String model, double engineVolume){
        super(brand, model,engineVolume);
    }

    @Override
    public void pit_stop() {

    }

    @Override
    public void maxSpeed() {

    }

    @Override
    public void lapBestTime() {

    }
}
