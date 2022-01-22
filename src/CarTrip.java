public class CarTrip {

    private int myStartOdometer;
    private int myEndOdometer;
    private double myTime;
    private double myGallonsUsed;

    public CarTrip()
    {
        myStartOdometer = 0;
        myEndOdometer = 0;
        myTime = 0.0;
        myGallonsUsed = 0.0;
    }

    public CarTrip(int start, int end, double time, double gallon)
    {
        myStartOdometer = start;
        myEndOdometer = end;
        myTime = time;
        myGallonsUsed = gallon;
    }

    public int getMyStartOdometer(){
        return myStartOdometer;
    }

    public int getMyEndOdometer() {
        return myEndOdometer;
    }

    public double getMyTime() {
        return myTime;
    }

    public double getMyGallonsUsed() {
        return myGallonsUsed;
    }

    public void setMyStartOdometer(int myStartOdometer) {
        this.myStartOdometer = myStartOdometer;
    }

    public void setMyEndOdometer(int myEndOdometer) {
        this.myEndOdometer = myEndOdometer;
    }

    public void setMyGallonsUsed(double myGallonsUsed) {
        this.myGallonsUsed = myGallonsUsed;
    }

    public void setMyTime(double myTime) {
        this.myTime = myTime;
    }
}
