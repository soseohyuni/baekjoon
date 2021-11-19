import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2869 
{
	public static void main(String[] args) throws IOException
	{
		// Scanner 는 계속 시간 초과가 됨 → BufferedReader 사용!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
		
		int day = (v - b) / (a - b);
        
		// 나머지가 있을 경우 (잔여 블럭이 있을 경우)
		if((v - b) % (a - b) != 0) 
			day++;
		
		System.out.println(day);
		
		/* ★ 반복문이 시간을 많이 잡아먹었다

		int n = 1;	// 날짜
		int h = 0;	// 현재 높이
		
		while(true)
		{
			if(h+a>=v)
			{
				System.out.println(n);
				break;
			}
			
			h = n * (a-b);
			n++;
			
			if(h>=v)
			{
				System.out.println(n);
				break;
			}
		}
		*/
		
		br.close();
		
	}
}
