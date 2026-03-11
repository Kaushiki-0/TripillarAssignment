import java.util.*;
public class Ques7 {
    public static void main(String[] args) {
        int arr[]={8,4,7,-2,3,-6};
        int pivot = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                pivot++;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}