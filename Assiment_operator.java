package operator;

import java.util.Scanner;

public class Assiment_operator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num1=sc.nextInt();
		
		num1=num1+1;
		System.out.println(num1);//11
		
		num1=num1++;
		System.out.println(num1);//11
		
		num1=++num1;
		System.out.println(num1);//12
		
		num1/=1;
		System.out.println(num1);//12
		
		
		
	}
}
