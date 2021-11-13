import java.util.Scanner;

public class Test8958 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        String[] arr = new String[num];

        for(int i=0; i<num; i++) 
        {
            int count = 0, sum = 0;
            arr[i] = sc.next();
            
            for (int j=0; j<arr[i].length(); j++) 
            {
                if(arr[i].charAt(j) == 'O')
                    sum += ++count;
                else 
                    count = 0;
            }
            
            System.out.println(sum);
        }
        sc.close();
    }
}