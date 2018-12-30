 
public class Q6 {

	public static void main(String[] args) {
		int i;
		int s=0,s1=0;
		for(i=1;i<=100;i++)
		{
			s+=i;
			s1+=(int)Math.pow(i,2);
		}
		int d=(int)Math.pow(s,2);
		System.out.println("Difference= "+(d-s1));	

	}

}
