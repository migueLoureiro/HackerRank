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
    
    public static double comb(int n, int x){
        double r = 0;
        r = (fact(n))/(fact(x)*fact(n-x));
        return r;
    }
    
    public static double binomial(int x, int n, double p){
        if (p<0 || p>1)
            return -1;
        return comb(n,x)*Math.pow(p,x)*Math.pow((1-p),(n-x));
    }

    public static void main(String[] args) {
        
        double p = 1.09/2.09;
        int n = 6;
        int x = 3;//3+
        
        double result = 0;
        for (int i=x;i<=n;i++){
            result += binomial(i,n,p);
        }
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(df.format(result));
        
    }
}