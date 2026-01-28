package jan_27_2;

import java.util.Scanner;

public class Mintute_conversion {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Give number");
		int min=sc.nextInt();
		System.out.println(min/60);
		System.out.println(min%60);
		
		System.out.println("Give number");
		int sec=sc.nextInt();
		System.out.println(sec/60);
		System.out.println(sec%60);

		System.out.println("Give number");
		int milsec=sc.nextInt();
		System.out.println(milsec/1000);
		System.out.println(milsec%1000);
	}

}
