public class Truck {

    private String truckID;
    private double odometer;
    private double mpg;
    private double fuel;

    private final double CAPACITY = 20.0;
    private static double totalFuel = 0.0;

    public Truck(String a)
    {
        truckID = a;
        odometer = 0.0;
        mpg = 0.0;
        fuel = 0.0;
    }

    public Truck(String ID, double odometer1, double mpg1, double fuel1)
    {
        this.truckID = ID;
        this.odometer = odometer1;
        this.mpg = mpg1;
        this.fuel = fuel1;
    }

    public String getTruckID() {
        return truckID;
    }

    public double getOdometer() {
        return odometer;
    }

    public double getMpg() {
        return mpg;
    }

    public double getFuel() {
        return fuel;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public boolean enoughFuel (double miles){
        if(mpg * fuel >= miles){
            return true;
        } else {
            return false;
        }
    }

    public int drive(double miles)
    {
        if(miles - mpg * fuel <= 0) {
            odometer += miles;
            fuel = (miles - mpg * fuel) * (-1) / mpg;
            return 1;
        } else {
            odometer += (miles - mpg * fuel);
            fuel = 0;
            return 0;
        }
    }

    public void fill(){
        double add = CAPACITY - totalFuel;
        totalFuel += add;
        fuel += add;
    }

    public int fill (double gallons){
        double totalFuel1 = totalFuel + gallons;
        if(totalFuel1 > CAPACITY){
            totalFuel1 = totalFuel;
            return 0;
        } else {
            fuel += gallons;
            totalFuel = totalFuel1;
            return 1;
        }
    }

    public static double getTotalFuel(){
        return totalFuel;
    }

    public String toString(){
        String truckID = "Truck: " + getTruckID();
        String Odometer = "Odometer: " + getOdometer();
        String mpg = "Miles Per Gallon: " + getMpg();
        String fuel = "Fuel: " + getFuel();
        return truckID + "\n" + Odometer + "\n" + mpg + "\n" + fuel;
    }

}
