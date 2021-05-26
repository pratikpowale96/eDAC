import java.util.Scanner;

public class TestEmpInfo {

	public static void main(String[] args) {
		String name,address;
		Double salary;
		Boolean married;
		int empid;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee ID:");
		empid=sc.nextInt();
		System.out.println("Enter Name:");
		name=sc.next();
		System.out.println("Enter Salary:");
		salary=sc.nextDouble();
		System.out.println("Enter Address:");
		address=sc.next();
		System.out.println("Marrial Status:");
		married=sc.nextBoolean();
		
		System.out.println("Emp ID:"+empid);
		System.out.println("Name:"+name);
		System.out.println("Salary"+salary);
		System.out.println("Married:"+married);
	}

}
