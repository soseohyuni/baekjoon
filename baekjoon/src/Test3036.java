import java.util.Scanner;

public class Test3036 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		// ù ��° ��
		int firstRing = sc.nextInt();
 
		for (int i=1; i<N; i++) 
		{
			int otherRing = sc.nextInt();
			
			// ���м��� ����� ���� �ִ����� ã��
			int gcd = gcd(firstRing, otherRing);
 
			// �и�� ���ڸ� �ִ������� �����ֱ� 
			System.out.println((firstRing / gcd) + "/" + (otherRing / gcd));
		}
		
		sc.close();
		
		/* Ʋ�ȴ� Ǯ��
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
 
	// �ִ����� �޼ҵ�
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
