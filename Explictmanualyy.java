package typecasting;

import java.util.Scanner;

public class Explictmanualyy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");
		double d=sc.nextDouble();
		long l=(long)d;
		int i=(int)l;
		
		
		System.out.println("double value "+d);
		System.out.println("Long value"+l);
		System.out.println("int value"+i);
	}

}
