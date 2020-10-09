package string;
import java.util.Scanner;
public class Splitex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
		     System.out.print("Input a Sentence: ");
			 String line = in.nextLine();
			 String[] words = line.split(":");
			 System.out.println(words[0]);
			 System.out.println(words[1]);
			 System.out.println(words[2]);
	}

}
