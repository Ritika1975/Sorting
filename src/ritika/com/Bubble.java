package ritika.com;

import java.util.Arrays;

public class Bubble {
        static void main(String[] args) {
            int []arr={1,3,4,2,5};
            System.out.println(Arrays.toString(bubble(arr)));
        }
        static int[] bubble(int[]arr){
//        run teh steps n-1 times
            for (int i = 0; i < arr.length-1; i++) {
//            for each step,max item will come at the last respective index
                for (int j = 0; j <arr.length-1-i ; j++) {
                    if (arr[j]>arr[j+1]){
                        swap(arr,j,j+1);
                    }
                }
            }
            return arr;
        }
        static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }



