public class Counter {
    private static int index = 0;
    public int count;
    public int start;

    // Public - Visible to Everyone
    // Protected - Visible to subclasses and same package classes
    // Private - Can be used inside class only
    // if not defined, only package classes can access(called package-private)
    public Counter(int initial) {
        index++;
        this.start = initial;
        this.count = initial;
    }
    // Constructors Do not contain Abstract/Final/Static,
    // Void, or any other return type, name must be same as
    // Class name
    public Counter() {
        this(0);
    }
    public int getCount() {
        return this.count;
    }
    public void increment() {
        this.count++;
    }
    public void increment(int x) {
        this.count += x;
    }
    public void reset() {
        this.count = this.start;
    }
    // 'keyword' must not be used in static method
    public static int getIndex() {
        return index;
    }
}