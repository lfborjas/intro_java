import java.util.Arrays;
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

    public static void main (String [] args)
    {
        int[] a = {1,2,3,4,5};
        swap(a, 1, 3);
        System.out.println(Arrays.toString(a));
        shuffle(a);
        System.out.println(Arrays.toString(a));
        shuffle(a);
        System.out.println(Arrays.toString(a));
        shuffle(a);
        System.out.println(Arrays.toString(a));
        int[] b = {5,4,3,2,1,0};
        sort(b);
        System.out.println(Arrays.toString(b));
        System.out.println(search(new int[]{1,2,3,4}, 3));
        System.out.println(search(new int[]{1,2,3,4}, 2));
        System.out.println(search(new int[]{1,2,3,4,5}, 3));
        System.out.println(search(new int[]{1,2,3,4,5}, 5));
        System.out.println(search(new int[]{1,2,3,4,5}, 1));
        System.out.println(search(new int[]{1,2,3,4,5}, 8));
    }
} 
