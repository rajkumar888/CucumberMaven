package javaDemoPack;

public class GreaterNo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=500;
		int b=200;
		int c=300;

		int max=a;
		
		if(a<b)
		{
		max=b;

			if(b<c)
			{
				max=c;
			}
		}
		else if(a<c)
		{
		max=c;
		}
		
		System.out.println(max);
		}

	}
