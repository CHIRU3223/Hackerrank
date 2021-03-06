import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    public static int[] leftShift(int[] a){
        int temp=a[0];
        for(int i=1;i<a.length;i++)
            a[i-1]=a[i];
        a[a.length-1]=temp;
        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        // Solution s=new Solution();
        int b[]=new int[a.length];
        for(int i=0;i<d;i++)
            b=leftShift(a);
        for(int i:b)
            System.out.print(i+" ");
        scanner.close();
    }
}
