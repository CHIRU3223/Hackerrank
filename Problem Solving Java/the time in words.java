import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static String timeInWords(int h, int m) {
        String[] s_m={
            "",
            "one minute",
            "two minutes",
            "three minutes",
            "four minutes",
            "five minutes",
            "six minutes",
            "seven minutes",
            "eight minutes",
            "nine minutes",
            "ten minutes",
            "eleven  minutes",
            "twelve minutes",
            "thirteen minutes",
            "fourteen minutes",
            "quarter",
            "sixteen minutes",
            "seventeen minutes",
            "eigthteen minutes",
            "nineteen minutes",
            "twenty minutes",
            "twenty one minutes",
            "twenty two minutes",
            "twenty three minutes",
            "twenty four minutes",
            "twenty five minutes",
            "twenty six minutes",
            "twenty seven minutes",
            "twenty eight minutes",
            "twenty nine minutes",
            "half"
        };
        String[] s_h=s_m[h].split(" ");
        if(m>=1 && m<=30){
            return s_m[m]+" past " +s_h[0];
        }
        else if(m==00)
            return s_h[0]+" o' clock";
        String[] s_h2=s_m[h+1].split(" ");//After 30mins hours has to be increased by 1
        return s_m[60-m] +" to "+s_h2[0];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
