public class Ques6 {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,5,5,5,6};
        int count = 0;
        int candidate = 0;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
             count++;
            } else {
           count--;
         }
        }
        System.out.println(candidate);
    }
}