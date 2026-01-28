package scanner;

import java.util.Scanner;

public class Data {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name");
		String st=sc.next();
	
		
		System.out.println("Enter add");
		String add=sc.next();
		
		
		char c;
		System.out.println("Enter grades");
		c=sc.next().charAt(0);
		
		
		
		int m;
		System.out.println("Enter marks");
		m=sc.nextInt();
	
		
		String Stream;
		System.out.println("Enter stream");
		Stream=sc.next();
		
		int avg;
		System.out.println("Enter avg");
		avg=sc.nextInt();
		
		Data d =new Data();
		System.out.println(d);
		
		
		System.out.println("Student Stream");
		
		System.out.println("Name is "+st);
		System.out.println("addr is"+add);
		System.out.println("Grade is"+c);
		System.out.println("marks is"+m);
		System.out.println("Stram is "+Stream);
		System.out.println("Avg is"+avg);
		
	}

}
