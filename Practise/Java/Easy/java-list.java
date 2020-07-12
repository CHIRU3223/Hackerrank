import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            l.add(temp);
        }
        int m=sc.nextInt();
        for(int i=0;i<m;i++)
        {
            String q=sc.next();
            if(q.equals("Insert"))
                l.add(sc.nextInt(),sc.nextInt());
            if(q.equals("Delete"))
                l.remove(sc.nextInt());
        }
        for(int i=0;i<l.size();i++)
            System.out.print(l.get(i)+" ");
    }
}
