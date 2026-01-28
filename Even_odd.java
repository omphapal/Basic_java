package jan_27_1;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		int num1=sc.nextInt();
		
		if(num1%2==0) {
			System.out.println("Even "+num1);
		}else {
			System.out.println("odd"+num1);
		}
	}
}
