package jan_27_1;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String o_email="omphapal1@gmail.com";
		String o_pass="900115146";
		
		System.out.println("Enter gmail");
		String email=sc.nextLine();
		
		System.out.println("Enter Password");
		String pass=sc.nextLine();
		
		if(o_email.equals(email)) {
		
			if(o_pass.equals(pass) && pass.equals(pass)){
				System.out.println("Login succcsfull");
		}
			else {
				System.out.println("Enter valid password");
			}
	}
	}

}
