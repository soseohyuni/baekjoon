import java.util.*;

public class Test10809
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"
        					, "l", "m", "n", "o", "p", "q", "r", "s", "t", "u"
        					, "v", "w", "x", "y", "z"};
        
        String[] copy = new String[alpha.length];
        for(int i=0; i<alpha.length; i++) 
        {
        	copy[i] = alpha[i];
        }
        
        for(int i=0; i<alpha.length; i++)
        {
        	for(int j=str.length(); j>0; j--)
        	{
        		if(str.substring(j-1, j).equals(copy[i]))
        			alpha[i] = Integer.toString(j-1);
        	}
        	
        	if(alpha[i].equals(copy[i]))
        		alpha[i] = "-1";
        }    
        
        for(String s : alpha)
        {
        	System.out.print(s + " ");
        }
        
        sc.close();
    }
}