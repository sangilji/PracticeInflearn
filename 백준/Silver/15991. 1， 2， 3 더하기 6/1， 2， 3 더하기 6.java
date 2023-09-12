import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	static int MOD = 1_000_000_009;
	static int n;
	static int m;
	static List<int[]> list = new ArrayList<>();
	static List<int[]> list2 = new ArrayList<>();
	static Map<Integer, Integer> map = new HashMap<>();
	static int[] arr;
	static int[] arr2;
	static long[] tree;
	static long[] lazy;
	static int SIZE = 100_000;
	static long[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		n = 1000000;
		dp = new long[n + 1];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 2;
		dp[4] = 3;
		dp[5] = 3;
		dp[6] = 6;
		for (int i = 7; i <= n; i++) {
			dp[i] = (dp[i - 2] + dp[i - 4] + dp[i - 6]) % MOD;
		}

		for (int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			sb.append(dp[n]).append("\n");

		}
		System.out.println(sb);

	}

}