import java.util.*;

public class Sorting {

    public static void gnomeSort(Comparable<Integer>[] list){
        //avila
    }
    
    public static void mergeSort(Comparable<Integer>[] list){
        //daniel
    }

    public static void quickSort(Comparable<Integer>[] list, int low, int high){
        //avila

        if(low<high){
            int pi = partitionqS(list, low, high);
            
            quickSort(list, low, pi-1);
            quickSort(list, pi+1, high);
        }
        
    }

    public static void radixSort(Comparable<Integer>[] list){
        int m = Sorting.getMax(list);

        for(int exp = 1; m/exp > 0; exp*= 10){
            countSort(list, list.length, exp);
        }
    }
    
    public static void bubbleSort(Comparable<Integer>[] list){
        //avila/dani
    }

    private static int partitionqS(Comparable<Integer>[] list, int low, int high){
        int pivot = (int) list[high];
        int i = (low-1); // es el indice del elemento mas pequeño.
        
        for(int x = low; x<high; x++){
            if((int) list[x] < pivot){
                i++;

                int temp = (int) list[i];
                list[i] = list[x];
                list[x] = temp;
            }
        }

        int temp = (int) list[i+1];
        list[i+1] = list[high];
        list[high] = temp;

        return i+1;
    }

    

    private static void countSort(Comparable<Integer>[] list, int n, int exp){
        Comparable<Integer>[] output = new Integer[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
        
        for(i = 0; i<n ; i++){
            count[((Integer) list[i] / exp) % 10]++;
        }

        for(i=1; i<10 ; i++){
            count[i]  += count[i-1];
        }

        for(i = n-1; i>= 0; i--){
            output[count[((Integer)list[i] / exp) % 10] - 1] = list[i]; 
            count[((Integer) list[i] / exp) % 10]--;
        }
        
        for(i = 0; i<n; i++){
            list[i] = output[i];
        }
    }

    private static int getMax(Comparable<Integer>[] list){
        int n = list.length;
        int mx = (Integer) list[0];

        for(int i = 1; i<n; i++){
            if((Integer)list[i] > mx)
                mx = (Integer) list[i];
        }

        return mx;
    }
}
