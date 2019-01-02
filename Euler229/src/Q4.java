
public class Q4 {

	public static void main(String[] args) {
		long max=0;
		for(int i=999;i>=100;i--)
		{
			for(int j=999;j>=100;j--)
			{
				int k=i*j;
				long c=palin(i*j);
				if(c==k && c>max)
					max=k;
			}
		}
		System.out.println("Product of Largest 3-digit palindrome: "+max);

	}
		public static long palin(long n)
		{
			long r=0,d=0;
		    while(n!=0)
			{
		    r=n%10;
			d=d*10+r;
			n=n/10;
		}
		return d;
		}
		

}
