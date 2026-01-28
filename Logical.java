package operator;
import java.util.Scanner;
public class Logical_operator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt(), num2=sc.nextInt(),num3=sc.nextInt();
		
		System.out.println((num>num2) && (num>num3));
		System.out.println((num>num2) || (num>num3));
		System.out.println(!(num>num2) && (num>num3));
		
	}
}
