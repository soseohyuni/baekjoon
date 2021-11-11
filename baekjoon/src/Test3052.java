import java.util.*;

public class Test3052
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;
        int[] counts = new int[42];
        
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<arr.length; i++)
        {
            counts[arr[i]%42] += 1;
        }
        
        for(int i=0; i<counts.length; i++)
        {
            if(counts[i]!=0)
                count++;
        }
        
        sc.close();
        
        System.out.println(count);
        
    }
}