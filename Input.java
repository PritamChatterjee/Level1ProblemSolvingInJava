package string;

import java.util.Scanner;



public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if(input.isBlank() || input.isEmpty())
		{
			System.out.println("Empty string or null");
		}
			else
			{
				System.out.println("value is "+input);
			}
	}

}
