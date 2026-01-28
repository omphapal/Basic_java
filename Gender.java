package jan_27_1;

import java.util.Scanner;

public class Gender {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter char");
		char gender=sc.next().charAt(0);
		
		if(gender=='f' || gender=='F') {
			System.out.println("bus free female "+gender);
		}
		else {
			System.out.println("for male not free free  "+gender);
		}
	}

}
