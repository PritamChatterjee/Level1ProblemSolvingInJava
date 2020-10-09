package commonprogs;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact *=i;
		}
		System.out.println("Factorial is ");
		System.out.println(fact);
	}

}
