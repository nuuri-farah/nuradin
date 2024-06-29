package hadiis;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class removeDuplicate {

        public static void main(String[] args) {
            Integer[] inputArray = {1, 2, 2, 3, 4, 4, 5};
            Integer[] outputArray = removeDuplicates(inputArray);

            System.out.println(Arrays.toString(outputArray));
        }

        public static Integer[] removeDuplicates(Integer[] arr) {
            LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
            return set.toArray(new Integer[0]);
}
    }


