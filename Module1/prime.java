import java.util.*;
public class prime {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        System.out.println("take a number");
		int a=sc.nextInt();
		int count=1;
		for(int i=2;i*i<=a;i++){
			if(a%i==0)
				count++;
		}
		if(count>1)
			System.out.println("not a prime number");
		else
			System.out.println("PRIME");
	}
}