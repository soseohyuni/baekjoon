import java.util.Scanner;

public class Test10950
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[t];
        
        for(int i=0; i<t; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            arr[i] = a+b;
            System.out.println(arr[i]);
        }
        
        sc.close();
    }
}