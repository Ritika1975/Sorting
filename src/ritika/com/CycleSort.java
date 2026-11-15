package ritika.com;

import java.util.Arrays;

public class CycleSort {
    static void main(String[] args) {
        int []arr={5,4,3,2,1};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }


//    MY CODE
//    static int[]cycle(int[]arr){
//        int value=arr[0];
//        int index=value-1;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]!=value-1){
//                swap(arr,arr[value-1],i);
//            }
//
//        }
//        return arr;
//    }



    static void cycle(int[]arr){
        int i=0;
        while(i< arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);
            } else{
                i++;
            }
        }

    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
