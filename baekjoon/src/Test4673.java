public class Test4673
{
  public static void main (String[] args)
  {
    int check[] = new int[10001];

    for (int i=1; i<10001; i++)
    {
      int n = d(i);
      if (n < 10001){
        check[n] = 1;
      }
    }
      
    for (int j=1; j<10001; j++)
    {
      if (check[j] == 0){
        System.out.println(j);
      }
    }
  }

  public static int d(int num)
  {
    int sum = num;

    while(num > 0)
    {
      sum = sum + (num % 10);
      num = num / 10;
    }

    return sum;
  }
}