import java.util.Scanner;

public class Day1_Prog11_EvenOddSum {

	public static void main(String[] args) {
		int num,evenSum=0,oddSum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : :");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				evenSum+=i;
			}
			else {
				oddSum+=i;
			}
		}
		System.out.println("Even Sum is "+evenSum);
		System.out.println("Even Odd is "+oddSum);
		
	}

}
