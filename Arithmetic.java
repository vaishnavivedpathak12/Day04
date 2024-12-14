package day4cw;
import java.util.*;
public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("your choice:"+"1.add"+"2.sub"+"3.mul"+"4.div");
		System.out.println("enter no.1");
		System.out.println("enter no.2");

		int ch=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int total;
		switch(ch) {
		case 1:
			total=a+b;
			System.out.println("Addition"+ total);
			break;
			
		case 2:
			total=a-b;
			System.out.println("substraction"+ total);
			break;
		case 3:
			total=a*b;
			System.out.println("multiplication"+ total);
			break;
		case 4:
			total=a/b;
			System.out.println("divisition"+ total);
			break;
		default:
			System.out.println("invalid choice");
		}
	}

}
