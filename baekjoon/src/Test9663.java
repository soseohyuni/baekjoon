import java.util.Scanner;

public class Test9663 
{
	// ��Ʈ��ŷ�� ��ǥ���� ����(ü��)
	
	// �� ������ index : ��
	// ���� �� : ��
	
	// ù ��° ������ �� ���� ä�������鼭 
	// ���� �� �ִ� ��ġ��� ���ȣ���� �ϸ鼭 ä�������� ��
	
	public static int[] arr;
	public static int n;
	public static int cnt = 0;
 	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr = new int[n];
		
		nQueen(0);
		
		System.out.println(cnt);
		
		sc.close();
	}
	
	// ��� ȣ��
	public static void nQueen(int depth)
	{
		if(depth == n)
		{
			cnt++;
			return;
		}
		
		for(int i=0; i<n; i++)
		{
			arr[depth] = i;
			
			// Possibility() �ش� ������ i��° �࿡ ���� �� �ִ����� �˻��ϴ� �Լ�
			if (Possibility(depth)) 
				nQueen(depth + 1);
		}
	}
	
	// �ٸ� ���� �����ϴ��� �˻��ϴ� ���ǹ�
	public static boolean Possibility(int col)
	{
		for(int i=0; i<col; i++)
		{
			// �ش� ���� ��� i���� ���� ��ġ�� ���(���� �࿡ ������ ���)
			if(arr[col] == arr[i])
				return false;
			
			// �밢���� ���� ���� ���
			else if(Math.abs(col-i) == Math.abs(arr[col]-arr[i]))
				return false;
		}
		
		return true;
	}
}
