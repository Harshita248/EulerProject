
public class Q3 {

	public static void main(String[] args) {
		long num=600851475143L;
		long num2=num;
		long f=0;//for largest factor
		int c=2;
		while(c*c<=num2)
		{
			if(num2%c==0)
			{
				num2=num2/c;
			    f=c; 
			}
			else
			 c++;
		}
		if(num2>f)
			f=num2;
		System.out.println("Largest factor= "+f);
		}
}
