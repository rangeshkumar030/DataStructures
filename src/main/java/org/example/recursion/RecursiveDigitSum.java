package org.example.recursion;

public class RecursiveDigitSum {
    public static void main(String[] args) {
        String s="861568688536788";
        int k=100000;
        System.out.println(superDigit(s,k));
    }

    public static int superDigit(String n, int k) {
        return superDigit(String.valueOf(superDigit(n)*k));

    }

    private static int superDigit(String num) {
        int res=0;
        if(num.length()==1){
            return Integer.parseInt(num);
        }
        for (int i = 0; i < num.length(); i++) {
            res+=num.charAt(i)-48;
        }
         return superDigit(String.valueOf(res));
    }
}
