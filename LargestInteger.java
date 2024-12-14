package day4cw;
import java.util.*;
public class LargestInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first num");
		int num1 = sc.nextInt();
		System.out.println("enter a second num");
		int num2 = sc.nextInt();
		System.out.println("enter a third num");
		int num3 = sc.nextInt();
		
		if(num1>=num2 && num1>=num3) {
			System.out.println("the largest num1");
		}else if(num2>=num1 && num2>=num3) {
			System.out.println("the largest num2");
		}else {
			System.out.println("the largest num3");
		}
		}

}
