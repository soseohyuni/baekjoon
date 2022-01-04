import java.util.Scanner;

public class Test9663 
{
	// 백트래킹의 대표적인 문제(체스)
	
	// 각 원소의 index : 열
	// 원소 값 : 행
	
	// 첫 번째 열부터 한 개씩 채워나가면서 
	// 놓을 수 있는 위치라면 재귀호출을 하면서 채워나가는 것
	
	public static int[] arr;
	public static int n;
	public static int cnt = 0;
 	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr = new int[n];
		
		nQueen(0);
		
		System.out.println(cnt);
		
		sc.close();
	}
	
	// 재귀 호출
	public static void nQueen(int depth)
	{
		if(depth == n)
		{
			cnt++;
			return;
		}
		
		for(int i=0; i<n; i++)
		{
			arr[depth] = i;
			
			// Possibility() 해당 열에서 i번째 행에 놓을 수 있는지를 검사하는 함수
			if (Possibility(depth)) 
				nQueen(depth + 1);
		}
	}
	
	// 다른 퀸을 공격하는지 검사하는 조건문
	public static boolean Possibility(int col)
	{
		for(int i=0; i<col; i++)
		{
			// 해당 열의 행과 i열의 행이 일치할 경우(같은 행에 존재할 경우)
			if(arr[col] == arr[i])
				return false;
			
			// 대각선에 놓여 있을 경우
			else if(Math.abs(col-i) == Math.abs(arr[col]-arr[i]))
				return false;
		}
		
		return true;
	}
}
