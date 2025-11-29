import java.util.Arrays;
import java.util.Random;

public class BirthdayParadox {
    private int sampleSize = 0;
    private int[][] sample;

    public BirthdayParadox(int n) {
        sampleSize = n;
        sample = new int[sampleSize][2];

        Random random = new  Random();

        for (int i = 0; i < sampleSize; i++) {
            int mm = random.nextInt(1, 13);
            int dd;
            
            switch (mm) {
                case 2 -> dd = random.nextInt(1, 30);
                case 4, 6, 9, 11 -> dd = random.nextInt(1, 31);
                default -> dd = random.nextInt(1, 32);
            }
            sample[i][0] = dd;
            sample[i][1] = mm;
        }
    }
    public boolean test() {
        for (int i = 0; i < sampleSize; i++) {
            for (int j = i + 1; j < sampleSize; j++) {
                if (Arrays.equals(sample[i], sample[j])) {
                    return true;
                }
            }
        }
        return false;
    }
    public void printSample() {
        for (int i = 0; i < sampleSize; i++) {
            System.out.println(Arrays.toString(sample[i]));
        }
    }
    public int getSampleSize() {
        return sampleSize;
    }
    public static double sampling(int runs, int size) {
        int yes = 0;
        int no = 0;

        BirthdayParadox paradox;

        for (int i = 0; i < runs; i++) {
            paradox = new BirthdayParadox(size);

            if (paradox.test()) {
                yes++;
            } else {no++;}
        }
        return (double)yes / (yes + no);
    }
}
