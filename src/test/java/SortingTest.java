import com.sun.org.apache.xml.internal.security.algorithms.JCEMapper;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class SortingTest {
    @Test
    public void quickSort() throws Exception {
        //Quick test
        int[] testInput = {6,7,12,18,19,27,5,12,4};
        Sorting.quickSort(testInput);
        int[] expectedOutput = {4,5,6,7,12,12,18,19,27};
        assertArrayEquals(testInput, expectedOutput);

        //Long test
        int[] longInput = makeRandomArray(500, 47);
        int[] longOut = longInput.clone();
        Sorting.quickSort(longInput);
        Arrays.sort(longOut);
        assertArrayEquals(longInput,longOut);
    }

    private static int[] makeRandomArray(int length, int seed)
    {
        Random rd = new Random(seed);
        int[] longInput = new int[length];
        for (int i = 0; i < length; i++)
        {
            longInput[i] = rd.nextInt(length);
        }
        return longInput;
    }
}