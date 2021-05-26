import java.util.Scanner;

public class Day1_Prog9_SumofNum {

	public static void main(String[] args) {
		int num,i,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : :");
		num=sc.nextInt();
		
		for(i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("Sum is "+sum);
		
		sc.close();
	}

}
