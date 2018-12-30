
public class Q2 {

	public static void main(String[] args) {
		int j=2,s=0;
		for(int i=1;i<=4000000;)
		{
			if(i%2==0)
				s+=i;
			int c=i+j;
			i=j;
			j=c;
			
		}
		System.out.println("sum= "+s);
		

	}

}
