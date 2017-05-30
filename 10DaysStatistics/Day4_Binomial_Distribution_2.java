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
        //results:
        double result=0;
        DecimalFormat df = new DecimalFormat("#.###");
        
        //input:
        double p = 0.12;
        int n = 10;
        int x = 2;//0,1,2 = result1 8,9,10 2-10 2nd result
        
        //calculations
        result = 0;
        for (int i=0;i<=x;i++){
            result += binomial(i,n,p);
        }
        System.out.println(df.format(result));
        
        result = 0;
        for (int i=2;i<=n;i++){
            result += binomial(i,n,p);
        }        
        System.out.println(df.format(result));
        
    }
}