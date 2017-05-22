import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static double mean(int[] x){
        double r=0;
        int n = x.length;

        double t=0;
        for (int i=0;i<n;i++){
            t += x[i];
        }
        r = t/n;
        
        return r;
    }
    
    public static int[] sort(int[] x){
        int n = x.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-1;j++){
                if (x[j]>x[j+1]){
                    int t = x[j];
                    x[j] = x[j+1];
                    x[j+1] = t;
                }
            }   
        }
        return x;
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i=0;i<n;i++){
            x[i] = sc.nextInt();
        }
                
        x = sort(x);
        /*
        for (int i=0;i<n;i++){
            System.out.print(x[i]+" ");
        }
        */
        
        double mean = mean(x);
        
        //System.out.println(mean);
        
        double t=0;
        for (int i=0;i<n;i++){
            t += Math.pow((x[i]-mean),2);
        }
        
        
        double r = Math.sqrt(t/n);

        System.out.printf("%.1f",r);

        sc.close();

    }
}