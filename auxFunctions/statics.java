
//Statics aux functions:
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
    //r[0]=quartile1
    //r[1]=quartile2
    //r[2]=quartile3
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