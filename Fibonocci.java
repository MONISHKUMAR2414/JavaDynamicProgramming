import java.util.*;
public class Fibonocci
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int [] dp = new int [n + 1];
	    dp[0] = 0;
	    dp[1] =1;
	    for(int i = 2 ; i <=n ; i++){
	        dp[i] = dp[i-1] + dp[i-2];
	    }
		System.out.println(dp[n]);
		
		int m = sc.nextInt();
		System.out.println(dp[m]);
		
		int j = sc.nextInt();
		System.out.println(dp[j]);
	}
}
