package math;
import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a value");
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	System.out.println(a+" "+b);//10 20
	
	a=a+b;//a = 1o+20=30
	b=a-b;//20 =30-20=10	
	a=a-b;//30 =30-10=20
	System.out.println(a+" "+b);//20 10
	
	
System.out.println(a+" "+b);//10 20
	
	a=a*b;//a = 200
	b=a/b;//b=10	
	a=a/b;//a =200/10=20
	System.out.println(a+" "+b);//20 10
	
	}
}
