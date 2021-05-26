import java.util.Scanner;

public class Day1_Prog10_Panlindrone {

	public static void main(String[] args) {
		int originalNum,num,sum=0,remin;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		num=sc.nextInt();
		originalNum=num;
		
		while(num!=0) {
			remin=num%10;
			sum=sum*10 + remin;
			num=num/10;
			}
		if( originalNum== sum)
			System.out.println("This is a Palindrone Number");
		else
			System.out.println("This is not a Palindrone Number");
		
		sc.close();
	}

}
