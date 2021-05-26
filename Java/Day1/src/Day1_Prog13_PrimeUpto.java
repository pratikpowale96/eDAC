import java.util.Scanner;

public class Day1_Prog13_PrimeUpto {

	public static void main(String[] args) {
		int n,i,j,c=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value  : : ");
		n=sc.nextInt();
		
		for(i=2;i<=n;i++) 
		{
			c=1;
			for(j=2;j<=i-1;j++)
			{
				if(i%j==0) 
				{
					c=0;
					break;
				}
			}
				if(c==1)
					System.out.println(i);
		}	
	}
}
