package ritika.com;

import java.util.Arrays;

public class SelectionSort {
    static void main(String[] args) {
       int[]arr={};
       Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
            int value=MaxValue(arr,0, last);
            swap(arr,value,last);
        }
        }

    static int MaxValue(int[]arr,int start,int last){
        int max=start;
        for (int i = start; i <=last; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
          return max;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
