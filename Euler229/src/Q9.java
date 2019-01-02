
public class Q9 {

	public static void main(String[] args) {
		for(int a=3;a<1000;a++)
		{
			for(int b=a+1;b<1000;b++)
			{
				int csq=(int)(Math.pow(a,2)+Math.pow(b,2));
				int c=1000-a-b;
				int d=(int)Math.pow(c,2);
			
				if(d==csq)
				{
					System.out.println("Value of (abc)= "+d);
					break;
			}
		
		}
	}
	}
}

	



