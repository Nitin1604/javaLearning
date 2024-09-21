package oopsConcepts.OOPSDesignClass.Fibonacci.Main;

public class FibonacciUtils {

    private int maxN;

    public FibonacciUtils() {
        this.maxN = 10000;
    }

    FibonacciUtils(int maxN) {
      // maxN = n;
        this.maxN = maxN;
    }

    public int [] fibSeries(int n) {
        int [] arr = new int[n];
        if(n == 1) {
            arr[0] = 0;
            return arr;
        }
        arr[0] = 0;
        if(n == 2) {
            arr[1] = 1;
            return arr;
        }
        arr[1] = 1;

        for(int i=2;i<n;i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    int getFibonacciAtN(int n) {
        int [] arr = fibSeries(n);
        return arr[n-1];
    }


}
