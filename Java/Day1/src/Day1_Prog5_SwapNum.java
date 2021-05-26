import java.util.Scanner;

public class Day1_Prog5_SwapNum {

	public static void main(String[] args) {
		int num1,num2,temp;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number:");
		num1=sc.nextInt();
		System.out.println("Enter second number:");
		num2=sc.nextInt();
		
		temp=num2;
		num2=num1;
		num1=temp;
		
		System.out.println("----After Swap---");
		System.out.println("num1:"+num1+"num2:"+num2);

	}

}
