package jan_27_1;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter num1");
		int Salary=sc.nextInt();
		
//		System.out.println("Enter num2");
//		int num2=sc.nextInt();
		
		if(Salary>=1200000) {
			
			
			System.out.println("have gst of 12%"+Salary);
		}else {
			System.out.println("no gst on salary"+Salary);
		}

	}

}
