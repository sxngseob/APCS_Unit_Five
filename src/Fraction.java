public class Fraction {

    private int numerator;
    private int denominator;

    Fraction(int n, int d)
    {
        this.numerator = n;
        this.denominator = d;

        if(this.denominator < 0) {
            this.numerator -= 2 * this.numerator;
            this.denominator += 2 * this.denominator;
        }

        int GCD = reducing(this.numerator, this.denominator);
        this.numerator = this.numerator / GCD;
        this.denominator = this.denominator / GCD;

    }

    Fraction()
    {
        this.numerator = 1;
        this.denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int reducing(int m, int n)
    {
        while(m % n != 0){
            int m1 = m;
            int n1 = n;
            m = n1;
            n = m1 % n1;
        }
        return Math.abs(n);
    }

    public static Fraction add(Fraction f1, Fraction f2)
    {
        int num = f1.getNumerator() * f2.getDenominator() + f2.getNumerator() + f1.getDenominator();
        int den = f1.getDenominator() * f2.getDenominator();

        Fraction a = new Fraction(num, den);
        return a;
    }

    public static Fraction subtract(Fraction f1, Fraction f2)
    {
        int num = f1.getNumerator() * f2.getDenominator() - f2.getNumerator() + f1.getDenominator();
        int den = f1.getDenominator() * f2.getDenominator();

        Fraction a = new Fraction(num, den);
        return a;
    }

    public static Fraction multiply(Fraction f1, Fraction f2)
    {
        int num = f1.getNumerator() * f2.getNumerator();
        int den = f1.getDenominator() * f2.getDenominator();

        Fraction a = new Fraction(num, den);
        return a;

    }

    public static Fraction divide(Fraction f1, Fraction f2)
    {
        int num = f1.getNumerator() * f2.getDenominator();
        int den = f1.getDenominator() * f2.getNumerator();

        Fraction a = new Fraction(num, den);
        return a;
    }

    public String toString() {
        String return1 = "";

        if(this.numerator < 0 || this.denominator < 0){
            return1 += "-";
        }

        if(this.numerator / this.denominator >= 1){
            int a = (this.numerator / this.denominator);
            int b = this.numerator % this.denominator;
            return1 += (a + " " + b + " / " + this.denominator);
        } else {
            return1 += (this.numerator + " / " + this.denominator);
        }

        return return1;

    }
}

