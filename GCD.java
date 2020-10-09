package commonprogs;

public class GCD {
public static int findGCD(int n1, int n2)
{
	int gcd=1;
	for(int i = 1; i<=n1 && i<=n2; i++)
	{
		if(n1%i==0 && n2%i==0)
		{
			gcd= i;
		}
	}
	return gcd;
	
}
public static void main(String[] args) {
	System.out.println(findGCD(12, 32));
}
}
