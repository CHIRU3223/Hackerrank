import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        String[] a=s.split(":");
        if(a[2].indexOf("PM")>=0 && Integer.parseInt(a[0])<12)
            a[0]=String.valueOf(Integer.parseInt(a[0])+12);
        if(Integer.parseInt(a[0])==12 && a[2].indexOf("AM")>=0)
            a[0]="00";
        String new_time=a[0];
        for(int i=1;i<3;i++)
            new_time+=":"+a[i];
        new_time=new_time.replace("PM","");
        new_time=new_time.replace("AM","");
        return new_time;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
