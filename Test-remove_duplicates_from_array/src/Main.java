import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 8, 2, 4, 8};

        System.out.println("============== With Stream API ================");
        System.out.println(Arrays.toString(getArrWithoutDuplicates(arr)));

        System.out.println("\n============== With Collection API ================\n");
        System.out.println(removeDuplicatesFromArray(arr));

    }

    public static int[] getArrWithoutDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }

    public static Set<Integer> removeDuplicatesFromArray(int[] arr) {
        Set<Integer> noDuplicates = new HashSet<>();
        for (Integer el : arr) {
            noDuplicates.add(el);
        }
        return noDuplicates;
    }
}
