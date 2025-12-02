public class AP extends PG {
    
    protected long incr;

    public AP() {this(0, 1);}
    public AP(int start, int increment) {
        super(start);
        incr = increment;
    }
    @Override
    protected void advance() {
        current += incr;
    }
}
