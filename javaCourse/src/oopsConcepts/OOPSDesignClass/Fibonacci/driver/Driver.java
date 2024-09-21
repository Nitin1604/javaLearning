package oopsConcepts.OOPSDesignClass.Fibonacci.driver;

import oopsConcepts.OOPSDesignClass.Fibonacci.Main.FibonacciUtils;

public class Driver {
    public static void main(String[] args) {
        FibonacciUtils utils = new FibonacciUtils();
        int [] res = utils.fibSeries(15);
        for(int ele : res) {
            System.out.println(ele);
        }
    }
}
