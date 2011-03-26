package utilidades;
public class Arreglos{

    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void shuffle(int[] a){
        int N = a.length;
        int r = 0;
        for (int i = 0; i < N ; i++){
            r = (int)(Math.random() * (N-i)) + i;
            swap(a, r, i);
        } 
    }

    public static void sort(int[] a){
        for (int i = 0; i < a.length ; i++){
            for (int j = a.length-1; j > i ; j-- ){
                if (a[j-1] > a[j])
                    swap(a, j-1, j);
            } 
        } 
    }
    

    public static int search(int[] a, int elem){
        sort(a);
        return binarySearch(a, elem, 0, a.length-1);
    }
    
    private static int binarySearch(int[] a, int elem, int low, int high){
        if(high < low) return -1;
        int mid = low + (high-low)/ 2; //equivale a (low+high)>>>1
        if(a[mid] > elem)
            return binarySearch(a, elem, low, mid-1);
        else if(a[mid] < elem)
            return binarySearch(a, elem, mid+1, high);
        else
            return mid;

    }

} 
