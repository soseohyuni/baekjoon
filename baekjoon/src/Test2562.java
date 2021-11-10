import java.util.Scanner;

public class Test2562
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        int temp[] = new int[9];
        
        int count = 1;
        int max = 0;
        
        for(int i=0; i<9; i++)
        {
            arr[i] = sc.nextInt();
            temp[i] = arr[i];
        }
        
        for(int i=0; i<8; i++)
        {
            if(arr[i]>arr[i+1])
                arr[i+1] = arr[i];
            
            max = arr[i+1];
        }
        
        for(int i=0; i<9; i++)
        {
            if(max==temp[i])
                break;
            
            count++;
        }
        
        System.out.print(max + "\n" + count);
        
        sc.close();
    }
}
