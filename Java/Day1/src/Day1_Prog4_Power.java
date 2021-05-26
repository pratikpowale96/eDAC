import java.util.Scanner;

public class Day1_Prog4_Power {

	public static void main(String[] args) {
		double num1,num2,result;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first num:");
		num1=sc.nextInt();
		System.out.println("Enter second num:");
		num2=sc.nextInt();
		
		result=Math.pow(num1,num2);
		
		System.out.println(num1+"^"+num2+"="+result);

	}

}
