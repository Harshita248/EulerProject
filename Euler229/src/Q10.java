
public class Q10 {

	public static void main(String[] args) {
		long s=0;
		for(int i=0;i<2000000;i++)
		     if(prime(i))
				s+=i;
		System.out.println("Sum :"+s);
		}
			public static boolean prime(long num)
			{
			for(int i=2;i<=Math.sqrt(num);i++)
			   if(num%i==0)
	            return false;
			
				return true;
				
			}
			
			
			
}


