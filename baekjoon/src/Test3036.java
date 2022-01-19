import java.util.Scanner;

public class Test3036 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		// 첫 번째 링
		int firstRing = sc.nextInt();
 
		for (int i=1; i<N; i++) 
		{
			int otherRing = sc.nextInt();
			
			// 기약분수로 만들기 위한 최대공약수 찾기
			int gcd = gcd(firstRing, otherRing);
 
			// 분모와 분자를 최대공약수로 나눠주기 
			System.out.println((firstRing / gcd) + "/" + (otherRing / gcd));
		}
		
		sc.close();
		
		/* 틀렸던 풀이
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=1; i<N; i++)
		{
			if(arr[0]%arr[i]==0)
				System.out.println(arr[0]/arr[i]+"/1");
			else
				System.out.println(arr[0]/(arr[0]%arr[i])+"/"+arr[i]/(arr[0]%arr[i]));
		}
		*/
	}
 
	// 최대공약수 메소드
	static int gcd(int a, int b) 
	{
		int r;
 
		while (b != 0) 
		{
			r = a % b;
			a = b;
			b = r;
		}
		
		return a;
	}
}
