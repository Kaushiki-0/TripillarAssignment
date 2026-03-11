class Ques1 {
public static void main(String[] args){
    int a[]={1,2,3,-2,5};
    int n=a.length;
    int cur_sum=a[0];
    int max_sum=a[0];
    for(int i=1;i<n;i++){
    cur_sum=Math.max(a[i],cur_sum+a[i]);
    max_sum=Math.max(cur_sum,max_sum);
    }
    System.out.println(max_sum);
}
}