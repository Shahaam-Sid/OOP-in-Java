public class Main {
    public static void main (String[] args) {
        Counter counter = new Counter();

        for (int i = 0; i < 10; i++) {
            counter.increment(i);
        }

        Counter counter2 = new Counter(5);
        counter2.increment();

        System.out.print(counter.getCount() + " ");
        System.out.print(counter2.getCount());
        System.out.println("\n" + Counter.getIndex());
    }
}
