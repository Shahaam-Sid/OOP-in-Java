public class PG{
    
    protected long current;

    public PG() {this(0);}
    public PG(int start) {
        current = start;
    }
    public long nextValue() {
        long ans = current;
        advance();
        return ans;
    }
    protected void advance() {
        current++;
    }
    public void printProgression(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(nextValue());
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}