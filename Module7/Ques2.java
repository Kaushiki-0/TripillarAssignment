import java.util.Arrays;

public class Ques2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int target = 2;
        
        int first = findOccurrence(arr, target, true);
        int last = findOccurrence(arr, target, false);
        
        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }

    public static int findOccurrence(int[] arr, int target, boolean isFirst) {
        int low = 0;
        int high = arr.length - 1;
        int res = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                res = mid;
                if (isFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
}