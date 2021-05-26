import java.util.Scanner;

public class Day1_Prog7_pow {

	public static void main(String[] args) {
		int base,power;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter base Value");
		base=sc.nextInt();
		
		System.out.println("Enter power Value");
		power=sc.nextInt();
		
		System.out.println(Math.pow(base, power));
		sc.close();
	}

}
