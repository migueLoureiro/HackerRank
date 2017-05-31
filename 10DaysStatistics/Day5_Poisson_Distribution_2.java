import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        //results:
        double result=0;
        DecimalFormat df = new DecimalFormat("#.###");
        double avg;
        
        //nothing to do with Poission Distribution. Just plain formula on input
        //case1:
        avg = 0.88;
        result = 160 + (40 * (avg + Math.pow(avg, 2) ) );
        System.out.println(df.format(result));

        //case2:
        avg = 1.55;
        result = 128 + ( 40 * (avg + Math.pow(avg, 2) ) );
        System.out.println(df.format(result));
        
    }
}
