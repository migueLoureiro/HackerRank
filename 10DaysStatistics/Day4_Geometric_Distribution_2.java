import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static double geometricProbability(int n, double p){
        double r=0;
        r = Math.pow((1-p),(n-1))*p;
        return r;
    }

    public static void main(String[] args) {
        //results:
        double result=0;
        DecimalFormat df = new DecimalFormat("#.###");
        
        //input:
        double p = 1d/3d;//((double) 1/ (double) 3);
        int n = 5;
        
        //calculations
        //g(n,p) = (q^(n-1))*p
        for (int i=1;i<=n;i++){
            result = geometricProbability(n,p);
        }
        //System.out.println(result);
        System.out.println(df.format(result));
        
    }
}