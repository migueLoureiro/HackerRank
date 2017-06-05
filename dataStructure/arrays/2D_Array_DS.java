import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int maxSumHourGlass(int n[][]){
        int result = Integer.MIN_VALUE;
        for(int i=1; i < n.length-1; i++){
            for(int j=1; j < n[0].length-1; j++){
                int t = 0;
                t += n[i-1][j-1] + n[i-1][j] + n[i-1][j+1];
                t += n[i][j];
                t += n[i+1][j-1] + n[i+1][j] + n[i+1][j+1];
                if (t>result){
                    result = t;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int result = maxSumHourGlass(arr);
        System.out.println(result);
    }
}
