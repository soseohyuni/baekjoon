import java.util.*;

public class Test10871
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int num = sc.nextInt();
        int[] arr = new int[size];
       
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();  
        }
        
        for(int i=0;i<size;i++)
        {
            if(arr[i]<num)
                System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}
