
public class Q7 {

	public static void main(String[] args)
	{
		System.out.println(prime10001(10001));
	}
	public static long prime10001(long n)
	{
		int c=0;
		long p=1;
		while(c<n)
		{
			p++;
			if(prime(p))
				c++;
		}
	return p;
}
public static boolean prime(long n)
{
	if(n<2)
		return false;
	if(n==2)
		return true;
	for(int i=2;i<=Math.sqrt(n);i++)
		if(n%i==0)
			return false;
	return true;
}
}

				
					
			
			
		
		
		



	


	


