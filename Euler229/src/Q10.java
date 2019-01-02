
public class Q10 {

	public static void main(String[] args) {
		long s=2;
		for(long i=3;i<2000000;i+=2)
		     if(prime(i))
				s+=i;
		System.out.println("Sum :"+s);
		}
			public static boolean prime(long num)
			{
			for(int j=2;j<=Math.sqrt(num);j++)
			   if(num%j==0)
	            return false;
			
				return true;
				
			}
			
			
			
}


