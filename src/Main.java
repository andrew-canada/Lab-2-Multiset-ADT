import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void profileMultiSet(MultiSet myInput, int n) {
        Random random = new Random();
        List<Integer> itemsAdded = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = random.nextInt(101);
            myInput.add(x);
            itemsAdded.add(x);
        }

        assert myInput.size() == n : "Size should be " + n;

        long start = System.nanoTime();

        for (Integer x : itemsAdded) {
            myInput.remove(x);
        }

        long end = System.nanoTime();

        assert myInput.isEmpty() : "MultiSet should be empty";

        double duration = (end - start) / 1_000_000_000.0;

        System.out.printf("%5d %37s %.6f%n",
                n,
                myInput.getClass().getSimpleName(),
                duration);
    }

    public static void main(String[] args) {
        MultiSet[] multisets = {new TreeMultiSet()};
        for (MultiSet multiset : multisets) {
            for (int n : new int[]{500, 1000, 2000, 4000}) {
                profileMultiSet(multiset, n);
            }
        }
    }
}
