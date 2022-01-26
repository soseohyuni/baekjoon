import java.util.HashMap;
import java.util.Scanner;

public class Test9375 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		 
		while (T-- > 0) 
		{
			// <종류, 개수>
			HashMap<String, Integer> hm = new HashMap<>();	
			
			int N = sc.nextInt();
			
			while (N-- > 0) 
			{
				// 의상 이름
				sc.next();
				
				// 의상 종류
				String kind = sc.next();
				
				if (hm.containsKey(kind))
					hm.put(kind, hm.get(kind) + 1);
				else 
					hm.put(kind, 1);
			}
 
			int result = 1;
 
			// 안입는 경우를 위해 +1
			for (int val : hm.values()) 
			{
				result *= (val + 1);
			}
			
			// 알몸인 상태를 제외하기 위해 -1
			System.out.println(result - 1);
 
		}
		
		sc.close();
	}
}
