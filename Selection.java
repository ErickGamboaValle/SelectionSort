package SelectionSort;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Selection {

    static int cmps = 0, moves = 0;

    static void sort(int[] array) {
        for (int p = 0; p < array.length - 1; p++) { //n+1
            int min = p;
            for (int i = p + 1; i < array.length; i++) { //n(n-1) / 2
                cmps ++;
                if (array[i] < array[min]) {
                    min = i;
                }
            }
            if (p != min) {
                int tmp = array[p];
                array[p] = array[min];
                array[min] = tmp;
                moves += 3;
            }
        }
    }
    
    
    
    public static int[] createEqualArray(int N, int value) {
        int[] array = new int[N];
        for(int i = 0; i < N; i++) array[i] = value;
        return array;
    }

    /* A utility function to print array of size n*/
    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        //int[] arr = createEqualArray(10, 1);
        int[] arr = {2, 3, 4, 5, 6, 7, 1};
        Selection iS = new Selection();
        iS.sort(arr);
        printArray(arr);
        System.out.printf("%d\n", moves);
        boolean infiniteloop = true;
        
        while(infiniteloop) {
    
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
        }
        }
    }
