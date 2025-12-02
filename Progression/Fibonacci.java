public class Fibonacci extends PG{
    
    protected long prev;

    public Fibonacci() {this(0, 1);}
    public Fibonacci(int first, int second) {
        super(first);
        prev = second - first;
    }
    @Override
    protected void advance() {
        long temp = prev;
        prev = current;
        current += temp;
    }
}
