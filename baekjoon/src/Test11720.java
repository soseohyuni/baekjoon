import java.util.*;

public class Test11720
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String str = "";
        String[] strArr = new String[n];
        int sum = 0;
        
        do 
        {
            str = sc.next();
            
            for(int i=0; i<n; i++)
            {
                strArr[i] = str.substring(i,i+1);
            }
            
        }while(strArr.length!=n);
        
        for(int i=0; i<n; i++)
        {
            sum += Integer.parseInt(strArr[i]);
        }
        
        sc.close();
        
        System.out.println(sum);
    }
}