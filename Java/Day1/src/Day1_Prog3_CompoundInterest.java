import java.util.Scanner;

public class Day1_Prog3_CompoundInterest {

	public static void main(String[] args) {
	
		
		double famount,prin,rate,r,interest,time;
		Scanner sc=new Scanner(System.in);
		System.out.println("Principle Amount : ");
		prin=sc.nextDouble();
		System.out.println("Rate : ");
		rate=sc.nextDouble();
		System.out.println("time : ");
		time=sc.nextDouble();
		r=1+(rate/100);
		famount=prin *(Math.pow(r,time));
		System.out.println("Final Amount is "+famount);
		interest=famount-prin;
		System.out.println("Interest is "+interest);
	}

}
