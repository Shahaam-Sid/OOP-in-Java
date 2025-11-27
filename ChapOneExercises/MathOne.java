public class MathOne {
    final private long n;

    public MathOne(long x) {
        n = x;
    }
    public long sum() {
        long sum = 0;
        for (long i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public boolean multiple(long m) {
        return n % m == 0;
    }
    public boolean isEven() {
        return (n & 1) == 0;
    }
    public long sumOfOdd() {
        long sum = 0;
        for (long i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
    public long sumOfSquare() {
        long sum = 0;
        for (long i = 0; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}