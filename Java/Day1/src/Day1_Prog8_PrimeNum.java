import java.util.Scanner;

public class Day1_Prog8_PrimeNum {

	public static void main(String[] args) {
		int num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		num=sc.nextInt();
		boolean check=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				check=false;
				break;
			}
			
		}
		if(check)
			System.out.println("  This is a  Prime Number ");
		else 
			System.out.println(" This is not a Prime Number");
		
		sc.close();
	}
	
}
