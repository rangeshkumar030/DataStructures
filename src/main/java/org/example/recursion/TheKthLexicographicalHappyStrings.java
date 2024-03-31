package org.example.recursion;
//https://leetcode.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n/
public class TheKthLexicographicalHappyStrings {
    char arr[]={'a','b','c'};

    int count=0;

    public String getHappyString(int n, int k) {
        String res[]=new String[1];
        res[0]="";
        getHappyString(n,k,-1,"",res);
        return res[0];
    }
    public void getHappyString(int n, int k,int i,String s,String res[]) {
        //System.out.println(" "+n+" "+k+" "+i+" "+s);
        if(res[0]!="") return;
        if(n==0) {
            count ++;
            if(count==k){
                res[0]=""+s;
                System.out.println(" "+n+" "+k+" "+i+" "+s+" "+count);
            }

            return;
        }
        for (int j = 0; j < 3; j++) {
            if(j==i) continue;
            getHappyString(n-1,k,j,s+arr[j],res);
        }
    }

    public static void main(String[] args) {
        TheKthLexicographicalHappyStrings t=new TheKthLexicographicalHappyStrings();
        System.out.println(t.getHappyString(1,3));
    }

}
