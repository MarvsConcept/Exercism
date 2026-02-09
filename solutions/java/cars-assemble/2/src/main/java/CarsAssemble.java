public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        
        int baseRate = 221;

        if(speed <= 4){
            return (speed * baseRate);
        }else if (speed <= 8){
            return (speed * baseRate) * 0.9;
        }else if (speed <= 9){
            return (speed * baseRate) * 0.8;
        }else {
            return (speed * baseRate) * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        
        double perHour = productionRatePerHour(speed);
        
        return (int) (perHour / 60);
    }
}
        
