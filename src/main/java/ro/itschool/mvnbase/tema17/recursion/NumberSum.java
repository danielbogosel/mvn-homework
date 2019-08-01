package ro.itschool.mvnbase.tema17.recursion;

public class NumberSum {

    public int numberSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + numberSum(n / 10);
    }
}
