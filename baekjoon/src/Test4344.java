import java.util.*;

public class Test4344
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        double[] score;
        double[] sum = new double[test];
        double[] avg = new double[test];
        int[] pass = new int[test];
        int[] num = new int[test];
        
        for(int i=0; i<test; i++)
        {
            num[i] = sc.nextInt();
            score = new double[num[i]];
            
            for(int j=0; j<num[i]; j++)
            {
                score[j] = sc.nextDouble();
                sum[i] += score[j];
            }
            
            avg[i] = sum[i]/num[i];
        
            for(int j=0; j<num[i]; j++)
            {
            	if(score[j]>avg[i])
            		pass[i]++;
            }
        }
        
        for(int i=0; i<test; i++)
        {
        	System.out.printf("%.3f%%%n", ((double)pass[i]/num[i])*100);
        }
        
        sc.close();
    }
}