import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static int N;
    static int R;
    static int totalCount;
    static int[] result;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        R = s.nextInt();
        result = new int[R];
        visit = new boolean[N];

        perm(0);
        System.out.println(sb);
    }

    private static void perm(int depth) {
        if (depth == R) {
            sb.append(Arrays.stream(result)
                            .boxed()
                            .map(String::valueOf)
                            .collect(Collectors.joining(" ")))
                    .append("\n");
            totalCount++;
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                result[depth] = i + 1;
                perm(depth + 1);
                visit[i] = false;
            }
        }
    }
}