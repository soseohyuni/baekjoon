import java.util.Scanner;

public class Test2775 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		// ����Ʈ ���� 
		int[][] APT = new int[15][15];
 
		for(int i = 0; i < 15; i++) 
		{
			APT[i][1] = 1;	// i�� 1ȣ
			APT[0][i] = i;	// 0�� iȣ
		}
 
 
		for(int i = 1; i < 15; i ++) 
		{	// 1������ 14������
 
			for(int j = 2; j < 15; j++) 
			{	// 2ȣ���� 14ȣ����
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}
		
		// �׽�Ʈ �κ� 		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) 
		{
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(APT[k][n]);
		}
		
		sc.close();
	}
 
}
