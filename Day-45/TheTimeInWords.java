import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */

    public static String timeInWords(int h, int m) {
        String[] nums = new String[]  {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty", "twenty one",
                "twenty two", "twenty three", "twenty four",
                "twenty five", "twenty six", "twenty seven",
                "twenty eight", "twenty nine"
        };
        if (m == 0)
        { return (nums[h] + " o' clock ");}
        else if (m == 1)
        {return ("one minute past " + nums[h]);}
        else if (m == 59)
        {return ("one minute to " + nums[(h % 12) + 1]);}
        else if (m == 15)
        {return ("quarter past " + nums[h]);}
        else if (m == 30)
        {return ("half past " + nums[h]);}
        else if (m == 45)
        {return ("quarter to " +  nums[(h % 12) + 1]);}
        else if (m <= 30)
        { return ( nums[m] + " minutes past " +   nums[h]);}
        else if (m > 30)
        {return ( nums[60 - m] + " minutes to " +  nums[(h % 12) + 1]);  }
        return "";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
