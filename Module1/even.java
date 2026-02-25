class even{
    public static void main(String[] args){
        int sum=0;
        int n=2;
        while(n<=100){
            sum = sum + n;
            n = n + 2;
        }
        System.out.println("Sum of even numbers from 1 to 10 is"+" "+sum);
    }
}