class Line {

    private int a;
    private int b;
    private int c;

    public Line(int a1, int b1, int c1)
    {
        this.a = a1;
        this.b = b1;
        this.c = c1;
    }

    //slope a and b
    public double getSlope()
    {
        double slope = 0;

        slope = (double) -a / (double) b;

        return slope;

    }

    public boolean isOnLine(int x, int y)
    {
        if (a * x + b * y + c == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean isParallel(Line other)
    {
        if(this.getSlope() == other.getSlope()){
            return true;
        } else {
            return false;
        }

    }

    public String toString()
    {
        String equation = a + "x " + "+" + " " + b + "y + " + c + " = 0";
        return equation;
    }

}
