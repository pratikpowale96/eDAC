import java.util.Scanner;

public class Day1_Prog6_fact {

	public static void main(String[] args) {
		int num,fact=1,i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		num=sc.nextInt();
		
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of " +num+" is "+fact);
		sc.close();
	}
	
}
