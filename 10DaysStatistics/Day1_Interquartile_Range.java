//Day_1_Interquartile_Range
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

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
    
    public static double median(int[] x){
        double r=0;
        int n = x.length;
        
        if (n%2==1){
            r = (double) x[n/2];
        }else{
            int m1 = (int) (n/2);
            int m2 = m1-1;
            r = (x[m1]+x[m2])/2;
        }        
        return r;
    }
    
    public static double[] quartiles(int[] x){
        double[] r = new double[3];
        int n = x.length;
        r[1] = median(x);
        
        int m = 0;
        if (n%2==1){
            m = ((n-1)/2);            
        }else{
            m = (n/2);
        }
        
        int[] x1 = new int[m];
        int[] x3 = new int[m];
        for (int i=0;i<m;i++){
            x1[i] = x[i];
            if (n%2==1){
                x3[i] = x[i+m+1];
            }else{
                x3[i] = x[i+m];
            }
        }
        r[0] = median(x1);
        r[2] = median(x3);
        
        return r;
    }
    
    public static void main(String[] args) {
        
        //parse input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e[] = new int[n];
        int f[] = new int[n];
        int m = 0;//final array length
        
        for (int i=0;i<n;i++){
            e[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            f[i] = sc.nextInt();
            m += f[i];
        }

        //build Data structure
        int x[] = new int[m];
        
        int ind=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<f[i];j++){
                x[ind] = e[i];
                ind++;
            }
        }
        x = sort(x);
        double r[] = quartiles(x);
        //validate structure
        /*
        for (int i=0;i<m;i++){
            System.out.print(x[i]+" ");
        } 
        //tests
        System.out.println();
        for (int i=0;i<r.length;i++){
            System.out.print(r[i]+" ");
        }
        System.out.println();*/
        
        //result
        System.out.println(r[2]-r[0]);
        
        sc.close();
        
        
    }
}