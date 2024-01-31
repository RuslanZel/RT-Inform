import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class NumberOfElements {

    public static Map<Integer, Integer> findNumberElements(int[] arr) {

        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        if (arr == null || arr.length == 0) {
            throw new NoSuchElementException("Array is empty");
        }

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        return countMap;
    }
}


