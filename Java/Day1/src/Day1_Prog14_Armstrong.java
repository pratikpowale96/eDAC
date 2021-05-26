import java.util.Scanner;

public class Day1_Prog14_Armstrong {

	public static void main(String[] args) {
		int num,sum=0,remin,temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : : ");
		num=sc.nextInt();
		
		temp=num;
		while(num!=0) {
			remin=num%10;
			
			sum=sum + (remin * remin * remin);
			num=num/10;
			
		}
		if(temp==sum)
			System.out.println("Number is Armstrong Number");
		else
			System.out.println("Number is not Armstrong Number");
		
		sc.close();
	}
}