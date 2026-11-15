package ritika.com;

import java.util.Arrays;

public class Dissapeared {
    static void main(String[] args) {
        int []arr={4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(cycle(arr)));
    }

    static int []cycle(int[] arr) {
        int i = 0;
//        cycle sort
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                 swap(arr,i,correct);
            }
              else{
                  i++;
            }
        }
//              just finding missing number
        int count=0;
            for (int j = 0; j < arr.length ; j++) {
            if(arr[j]!=j+1){
                  count++;
            }
        }
          int[] ans = new int[count];
        int k = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans[k] = j + 1;
                k++;
            }
        }

        return ans;

}
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}