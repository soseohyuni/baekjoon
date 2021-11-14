import java.util.*;

public class Test1065
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count = 0;
        int a, b, c = 0;
        
        for(int i=1; i<=n; i++)
        {
        	if(i<100)
        		++count;
        	else if(i<1000)
        	{
        		a = i/100;
        		b = (i - 100*a)/10;
        		c = i - 100*a - b*10;
        		
        		if((b-a)==(c-b) || (a-b)==(b-c))
        			++count;
        	}	
        }
        
        sc.close();
        
        System.out.println(count);
    }
}