import org.junit.Test;
import java.io.File;
import java.util.Scanner;
import static org.junit.Assert.*;

public class SortingTest {

    public Comparable<Integer>[] list;
    @Test
    public void gnomeSort() {
        Integer[] data = {3,7,5,1,6};
        Integer[] expected = {1,3,5,6,7};

        Sorting.gnomeSort(data, data.length);

        assertArrayEquals(expected, data);

    }

    @Test
    public void mergeSort() {
        Integer[] data = {100,7,5,50,6};
        Integer[] expected = {5,6,7,50,100};

        Sorting.mergeSort(data,0, data.length-1);

        assertArrayEquals(expected, data);
    }

    @Test
    public void quickSort() {
        Integer[] data = {30,27,5,100,6};
        Integer[] expected = {5,6,27,30,100};

        Sorting.quickSort(data,0, data.length-1);

        assertArrayEquals(expected, data);

    }

    @Test
    public void radixSort() {
        Integer[] data = {100, 4560, 584, 63, 1200};
        Integer[] expected = {63,100,584,1200,4560};

        Sorting.radixSort(data);
        assertArrayEquals(expected, data);

    }

    @Test
    public void bubbleSort() {
        Integer[] data = {2501, 488, 14, 233, 10000, 183};
        Integer[] expected = {14, 183, 233, 488, 2501, 10000};

        Sorting.bubbleSort(data);

        assertArrayEquals(expected, data);
    }
}