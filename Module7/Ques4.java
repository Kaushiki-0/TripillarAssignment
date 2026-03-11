import java.util.*;
class Ques4{
    public static void main(String[] args){
        int a[]={29,10,47,14,18};
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

}