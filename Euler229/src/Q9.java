
public class Q9 {

	public static void main(String[] args) {
		for(int a=3;a<1000;a++)
		{
			for(int b=a+1;b<1000;b++)
			{
				int csq=(int)(Math.pow(a,2)+Math.pow(b,2));
				int c=(int)Math.sqrt(csq);
			
				if(a+b+c==1000)
				{
					System.out.println("Value of (abc)= "+(a*b*c));
					break;
			}
		
		}
	}
	}
}

	



