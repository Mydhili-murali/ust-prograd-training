import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    /*
     * Complete the 'initialize' function below.
     *
     * The function accepts STRING s as parameter.
     */
    static int[][] count;
    static long[] f;
    static long mod = 1000000007;
    public static void initialize(String s) {
        // This function is called once before all queries.
        count = new int[s.length()][26];
        for (int i = 0; i < s.length(); i++)
        {
            if (i > 0)
            {
                for (int j = 0; j < 26; j++) count[i][j] = count[i-1][j];
            }
            count[i][s.charAt(i) - 'a']++;
        }
        f = new long[100000];
        f[0] = 1;
        for (int i = 1; i < 100000; i++) f[i] = f[i - 1] * i % mod;
    }
    /*
     * Complete the 'answerQuery' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER l
     *  2. INTEGER r
     */
    static int c[] = new int[26];
    public static int answerQuery(int l, int r) {
        // Return the answer for this query modulo 1000000007.
        l--;
        r--;
        for (int i = 0; i < 26; i++)
        {
            c[i] = count[r][i];
            if (l > 0)
            {
                c[i] -= count[l - 1][i];
            }
        }
        int len = 0;
        int oddCount = 0;
        for (int i = 0; i < 26; i++)
        {
            len += c[i] / 2;
            if (c[i] % 2 == 1) oddCount++;
        }
        long ans = f[len];
        long div = 1;
        for (int i = 0; i < 26; i++)
        {
            if (c[i] >= 4)
            {
                div *= f[c[i] / 2];
                div %= mod;
            }
        }
        if (div != 1) ans = solveCongruence(div, ans, mod);
        if (oddCount > 0)
        {
            ans *= oddCount;
            ans %= mod;
        }
        return (int) ans;
    }
    static long solveCongruence(long a, long b, long mod)
    {
        if (a == 1)
        {
            return b;
        }
        long b1 = -b%a;
        if (b1 != 0)
        {
            b1 += a;
        }
        long y = solveCongruence(mod % a, b1, a);
        return (mod * y + b) / a % mod;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        Result.initialize(s);

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int l = Integer.parseInt(firstMultipleInput[0]);

            int r = Integer.parseInt(firstMultipleInput[1]);

            int result = Result.answerQuery(l, r);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
