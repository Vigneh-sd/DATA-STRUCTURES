
    public class PowXN {
    public double myPow(double x, int n) {
        long power = n;
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }
        return fastPower(x, power);
    }

    private double fastPower(double x, long n) {
        if (n == 0) return 1;
        double half = fastPower(x, n / 2);
        if (n % 2 == 0) return half * half;
        else return half * half * x;
    }
}

      
