package org.example.recursion;

public class PowerOfNumber {

    public static void main(String[] args) {
        int n=2,p=5;
        System.out.println(myPow(n,p));
    }
    static double myPow(double n, int p) {
        if(p==0) return 1;
        double power=myPower(n,p);
        return p>0?power:1/power;
    }

    private static double myPower(double n, int p) {
        if(p==0) return 1;
        double x=myPower(n,p/2);
        return p%2==0?x*x:x*x*n;
    }
}
