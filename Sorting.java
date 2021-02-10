import java.util.*;

public class Sorting {

    public static void gnomeSort(Comparable<Integer>[] list, int n){
        
        int index = 0;

        while(index < n){
            if(index == 0)
                index++;
            if((int) list[index] >= (int) list[index -1])
                index++;
            else{
                int temp = 0;
                temp = (int) list[index];
                list[index] = list[index-1];
                list[index -1] = temp;
                index--;
            }
        }
        return;
    }
    
    public static void mergeSort(Comparable<Integer>[] list, int low, int high){
        
        if(low>=high){
            return;
        }
            
            int middle = low + (high - low)/2;

            mergeSort(list, low, middle);
            mergeSort(list, middle+1, high);

            merge(list, low, middle, high);
        
    }

    private static void merge(Comparable<Integer>[]list, int low, int middle, int high){
        int n1 = middle - low + 1;
        int n2 = high-middle;

        Comparable<Integer> L[] = new Integer[n1];
        Comparable<Integer> R[] = new Integer[n2];

        for(int i = 0; i<n1; i++){
            L[i] = list[low+i];
        }

        for(int j = 0; j<n2; j++){
            R[j] = list[middle + 1 + j];
        }

        int i = 0; int j = 0;

        int k = low;

        while(i<n1 && j<n2){
            if((Integer) L[i] <= (Integer) R[j]){
                list[k] = L[i];
                i++;
            }
            else{
                list[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            list[k] = L[i];
            i++;
            k++;
        }

        while(j < n2){
            list[k] = R[j];
            j++;
            k++;
        }
    }

    public static void quickSort(Comparable<Integer>[] list, int low, int high){


        if(low < high){
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
        int n = list.length;
        for(int i = 0; i < n-1;i++){
            for(int j = 0; j < n-i-1; j++){
                if( (int) list[j] > (int) list[j+1]){

                    int temp = (int) list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
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
