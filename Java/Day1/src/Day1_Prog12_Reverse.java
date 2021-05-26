import java.util.Scanner;

public class Day1_Prog12_Reverse {

	public static void main(String[] args) {
		int num,sum=0,remin;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : :");
		num=sc.nextInt();
		while(num!=0) {
			remin=num%10;
			sum=sum*10+remin;
			num=num/10;
		}
		System.out.println("Reversed number is "+sum);
	}

}
