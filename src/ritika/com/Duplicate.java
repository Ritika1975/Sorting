package ritika.com;

public class  Duplicate {
    static void main(String[] args) {

    }

    static int cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if(arr[i]!=i+1){
                int correct=arr[i];
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);
            } else{
                 return arr[i];
            }
            }
            else{
                i++;
            }
        }
        return -1;

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}