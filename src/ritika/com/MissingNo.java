package ritika.com;

import java.util.Arrays;

public class MissingNo {
    static void main(String[] args) {
        int []arr={0,1,2,3};
        System.out.println(find(arr));
    }
    static int find(int[]arr){
        int i=0;
        while(i< arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length&&arr[correct]!=arr[i]){
                swap(arr,i,correct);
            } else{
                i++;
            }
        }
// search for missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index){
                return index;
            }
        }
//        case 2
        return arr.length;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
