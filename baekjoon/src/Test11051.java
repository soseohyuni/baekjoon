import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// �ٽ� ���� (!!!!)
public class Test11051 
{
	public static final int div = 10007;
	 
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		System.out.println((factorial(N) * mod_inverse((factorial(N - K) * factorial(K)) % div, div - 2)) % div);
	}
 
	static int factorial(int N) 
	{
		if(N<=1) 
			return 1;
		
		return (N * factorial(N-1)) % div;
	}
 
	// ���� ���ϱ� (= ������ ���ϱ�)
	static int mod_inverse(int a, int p) 
	{
		int ret = 1;
		
		while(p>0) 
		{
			if(p%2 == 1) 
			{
				ret *= a;
				p--;
				ret %= div;
			}
			
			a *= a;
			a %= div;
			p >>= 1;
		}
		
		return ret;
	}
}