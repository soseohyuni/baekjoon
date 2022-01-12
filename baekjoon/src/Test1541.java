import java.util.Scanner;

public class Test1541 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int sum = Integer.MAX_VALUE;	// 초기 상태 여부 확인을 위한 값으로 설정 
		
		String[] arr = sc.nextLine().split("-");
		
		for(int i=0; i<arr.length; i++) 
		{
			int temp = 0;
 
			String[] add = arr[i].split("\\+");
			
			for(int j=0; j<add.length; j++) 
			{
				temp += Integer.parseInt(add[j]);
			}
			
			// 첫 번째 토큰인 경우 temp값이 첫 번째 수가 됨
			if (sum == Integer.MAX_VALUE) 
				sum = temp;
			else
				sum -= temp;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
