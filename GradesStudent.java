package day4cw;
import java.util.*;
public class GradesStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a percent of student ");
		int number = sc.nextInt();
		if(number>=80) {
			System.out.println("enter a grade A ");
		}else if(number>=60){
		System.out.println("enter a grade B");
		}else if(number>=40) {
			System.out.println("enter a grade C");
		}
		else {
			System.out.println("Fail");
		}
	}
}
