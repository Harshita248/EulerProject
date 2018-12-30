
public class Q1 {

	public static void main(String[] args) {
		System.out.println("SUM= "+chk());

	}
	public static int chk()
	{
		int s=0;
		for(int i=0;i<1000;i++)
			if(i%3==0 || i%5==0)
				s+=i;
		return s;
	}

}
