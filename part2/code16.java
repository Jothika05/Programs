package part2;

//number is 28, factors of 28 are 1,2,4,7,14. Now the sum of all these factors are 28 itself.
import java.util.Scanner;

public class code16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) { //28%1==0
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println(n+ " is perfect number");
		}
		else {
			System.out.println(n+ " is not a perfect number");
		}
		
	}

}
