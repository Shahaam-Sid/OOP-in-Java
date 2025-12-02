public class GP extends PG{
    
    protected long b;

    public GP() {this(1, 2);}
    public GP(int start, int base) {
        super(start);
        b = base;
    }
    @Override
    protected void advance() {
        current *= b;
    }
}
