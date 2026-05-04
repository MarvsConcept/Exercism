class NeedForSpeed {
    
    int speed;
    int batteryDrain;
    int battery = 100;
    int distanceDriven;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {

        return battery < batteryDrain;
    }

    public int distanceDriven() {

        return distanceDriven;
    }

    public void drive() {

        if(battery >= batteryDrain) {
            distanceDriven += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {

        var car = new NeedForSpeed(50, 4);

        return car;

    }
}

class RaceTrack {
    int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {

        while (!car.batteryDrained()) {
            car.drive();
        }

        return car.distanceDriven() >= distance; 
         
    }
}
