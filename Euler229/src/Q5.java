
public class Q5 {

	public static void main(String[] args) {
		System.out.println(smul(20));//to print smallest multiple

	}
	public static long smul(int num)
	{
		long c=fact(num);
		for(long i=num;i<=c;i=i+num)
		{
			if(multiple(i,num))
				return i;
		}
		return -1;
	}
public static boolean multiple(long m,int num)
{
	for(int i=1;i<num;i++)
	{
		if(m%i!=0)
			return false;
	}
	return true;
}
public static long fact(long num)//for factorial of a number
{
	if(num>1)
	{
		long x=num*fact(num-1);
		return x;
	}
	else if(num>=0)
		return 1;
	else
		return -1;
	}
}

