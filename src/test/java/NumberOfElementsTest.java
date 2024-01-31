import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfElementsTest {
    @Test
    void testFindFirstUnique() {
        int[] arr = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> expected = new LinkedHashMap<>();
        expected.put(1, 2);
        expected.put(3, 1);
        expected.put(4, 2);
        expected.put(5, 2);

        assertEquals(expected, NumberOfElements.findNumberElements(arr));
    }

    @Test
    void testFindFirstUniqueWithEmptyArray() {
        int[] arr = {};
        assertThrows(NoSuchElementException.class, () -> NumberOfElements.findNumberElements(arr));
    }

    @Test
    void testFindFirstUniqueWithNullArray() {
        int[] arr = null;
        assertThrows(NoSuchElementException.class, () -> NumberOfElements.findNumberElements(arr));
    }

    @Test
    void testFindFirstUniqueWithSingleUniqueElement() {
        int[] arr = {1};
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 1);

        assertEquals(expected, NumberOfElements.findNumberElements(arr));
    }

    @Test
    void testFindFirstUniqueWithDuplicatesOnly() {
        int[] arr = {1, 1, 1, 1};
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 4);

        assertEquals(expected, NumberOfElements.findNumberElements(arr));
    }
}