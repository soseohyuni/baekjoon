import java.util.*;

public class Test1546
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double sum = 0;
        Double[] arr = new Double[n];
        
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextDouble();
        }
        
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i]/arr[arr.length-1]*100;
        }
        
        sc.close();
        
        System.out.println(sum/n);
    }
}