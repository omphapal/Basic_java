package jan_27_1;

import java.util.Scanner;

public class Vovel {

	public static void main(String[] args) {

		Scanner dc=new Scanner(System.in);
		
		System.out.println("Enter Cahr");
		char ch=dc.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println("This values is ovel"+ ch);
	
	else
		System.out.println("This values is not ovel"+ ch);

	}
}
