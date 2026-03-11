import java.util.*;
class Ques9 {
    public static void main(String[] args) {
        int nums[]={0,1,3,4,5};
        Arrays.sort(nums);
        int l=0,r=nums.length-1;
        while(l <= r){
            int mid=l+(r-l)/2;
            if(nums[mid]==mid){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        System.out.print(l);    
    }
}