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

    }

    @Test
    public void bubbleSort() {


    }
}