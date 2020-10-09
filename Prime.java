package commonprogs;

public class Prime {
public static boolean isPrime(int num)
{
	boolean result = true;
	for(int i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
			result = false;
			break;
		}
		
	}
	
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isPrime(15));
	}

}
