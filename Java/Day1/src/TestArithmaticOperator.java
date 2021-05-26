import java.util.Scanner;

public class TestArithmaticOperator {

	public static void main(String[] args) {
		
		int num1,num2,result;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first Num:");
		num1=sc.nextInt();
		System.out.println("Enter second Num:");
		num2=sc.nextInt();
		
		result=num1+num2;
		System.out.println("Addition:"+result);

		result=num1-num2;
		System.out.println("Sub:"+result);

		result=num1*num2;
		System.out.println("Multi:"+result);
		
		result=num1/num2;
		System.out.println("Div:"+result);
	}

}
