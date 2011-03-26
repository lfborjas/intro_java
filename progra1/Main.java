import utilidades.Arreglos;
import java.util.Arrays;

public class Main{
    public static void main (String [] args)
    {
        int[] a = {1,2,3,4,5};
        Arreglos.swap(a, 1, 3);
        System.out.println(Arrays.toString(a));
        Arreglos.shuffle(a);
        System.out.println(Arrays.toString(a));
        Arreglos.shuffle(a);
        System.out.println(Arrays.toString(a));
        Arreglos.shuffle(a);
        System.out.println(Arrays.toString(a));
        int[] b = {5,4,3,2,1,0};
        Arreglos.sort(b);
        System.out.println(Arrays.toString(b));
        System.out.println(Arreglos.search(new int[]{1,2,3,4}, 3));
        System.out.println(Arreglos.search(new int[]{1,2,3,4}, 2));
        System.out.println(Arreglos.search(new int[]{1,2,3,4,5}, 3));
        System.out.println(Arreglos.search(new int[]{1,2,3,4,5}, 5));
        System.out.println(Arreglos.search(new int[]{1,2,3,4,5}, 1));
        System.out.println(Arreglos.search(new int[]{1,2,3,4,5}, 8));
        int res = Arreglos.search(new int[]{1,2,3}, 3);
        assert res == 6 : res;
    }
} 
