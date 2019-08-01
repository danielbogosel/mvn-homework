package ro.itschool.mvnbase.tema17.recursion;

public class NumberOfZero {
    public int zeroCounter(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 != 0) {
            return zeroCounter(n / 10);
        }
        return 1 + zeroCounter(n / 10);
    }
}




