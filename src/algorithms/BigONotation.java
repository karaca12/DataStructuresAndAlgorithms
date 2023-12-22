package algorithms;

public class BigONotation {
    public static int addUpWithFor(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int addUpWithPartialSums(int n) {
        int sum = n * (n + 1) / 2;
        return sum;
    }
}
