import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2869 
{
	public static void main(String[] args) throws IOException
	{
		// Scanner �� ��� �ð� �ʰ��� �� �� BufferedReader ���!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
		
		int day = (v - b) / (a - b);
        
		// �������� ���� ��� (�ܿ� ���� ���� ���)
		if((v - b) % (a - b) != 0) 
			day++;
		
		System.out.println(day);
		
		/* �� �ݺ����� �ð��� ���� ��ƸԾ���

		int n = 1;	// ��¥
		int h = 0;	// ���� ����
		
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
