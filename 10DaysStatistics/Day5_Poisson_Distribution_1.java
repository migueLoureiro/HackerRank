import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
     public static int fact(int x){
        if (x<0){
            return -1;
        }
        if (x==0){
            return 1;
        }
        if (x==1){
            return 1;
        }
        return x*fact(x-1);
    }
    
    public static double poissionProbabilty(double k, double avg){
        double r=0;
        r = Math.pow(avg,k) * Math.pow(Math.E,(-avg));
        r = r /  fact((int) k);
        return r;
    }

    public static void main(String[] args) {
        //results:
        double result=0;
        DecimalFormat df = new DecimalFormat("#.###");
        
        //input:
        double avg = 2.5;
        double k = 5;
        
        //calculations
        //g(n,p) = (q^(n-1))*p
        result = poissionProbabilty(k,avg);
        //System.out.println(result);
        System.out.println(df.format(result));
        
    }
}