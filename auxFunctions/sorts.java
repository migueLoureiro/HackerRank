
//Bubble sort algorithms:
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


