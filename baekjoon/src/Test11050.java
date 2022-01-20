import java.util.Scanner;

public class Test11050 	
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int T = N-K;
		
		if(N==K || K==0)
        {    
            System.out.println(1);
            System.exit(0);
        }
		
		int resN = N;
		int resT = T;
		int resK = K;
		
		for(int i=N-1; i>0; i--)
		{
			resN *= i;
			
			if(i<K)
				resK *= i;
			if(i<T)
				resT *= i;
		}
		
		System.out.println(resN/(resK*resT));

		sc.close();
	}
}
