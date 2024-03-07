package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/restore-ip-addresses/description/
public class RestoreIPAddresses {
    public static List<String> restoreIpAddresses(String s) {
        List<String> res=new ArrayList<>();

        restoreIpAddresses(s,res,0,0,"");
        return res;
    }

    private static void restoreIpAddresses(String s, List<String> res, int i, int c, String s1) {
        if(i>4) return;
        if(c==s.length()) {
            //System.out.println("here"+ s1);
            if(i==4)
            res.add(s1.substring(0,s1.length()-1));
            return;
        }
        for (int j = c+1; j <=c+3 && j<=s.length(); j++) {
            int x=Integer.parseInt(s.substring(c,j));
            if(x<0 || x>255 || (j-c>1 && x<10) || (j-c>2 && x<100)) return;

            //System.out.println("here "+" c:"+c+" s1: " +s1);
            restoreIpAddresses(s,res,i+1,j,s1+x+".");
        }

    }

    public static void main(String[] args) {
        String s = "101023";
        List<String> res= restoreIpAddresses(s);
        System.out.println(res);
    }
}
