import java.util.Scanner;

public class Test1541 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int sum = Integer.MAX_VALUE;	// �ʱ� ���� ���� Ȯ���� ���� ������ ���� 
		
		String[] arr = sc.nextLine().split("-");
		
		for(int i=0; i<arr.length; i++) 
		{
			int temp = 0;
 
			String[] add = arr[i].split("\\+");
			
			for(int j=0; j<add.length; j++) 
			{
				temp += Integer.parseInt(add[j]);
			}
			
			// ù ��° ��ū�� ��� temp���� ù ��° ���� ��
			if (sum == Integer.MAX_VALUE) 
				sum = temp;
			else
				sum -= temp;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
