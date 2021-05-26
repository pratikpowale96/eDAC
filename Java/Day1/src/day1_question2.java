import java.util.Scanner;

public class day1_question2 {
	public static void main(String[] args) {
		int num1, num2, sum;
		String x,y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1 : :");
		num1 = sc.nextInt();
		System.out.println("Enter number 2: : ");
		num2 = sc.nextInt();
		sum = num1 + num2;
		
		System.out.println("Enter first char:");
		x=sc.next();
		System.out.println("Enter second char:");
		y=sc.next();
		
		System.out.println("Addition = " + sum);
		System.out.println("Add of Char ="+(x+y));
		
		
	}
}