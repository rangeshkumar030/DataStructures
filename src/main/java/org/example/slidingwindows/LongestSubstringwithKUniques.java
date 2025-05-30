package org.example.slidingwindows;

import org.example.dynamicprogramming.MaximizeTheCutSegmentsBottomTop;

import java.util.HashMap;

//https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1
public class LongestSubstringwithKUniques {


    public int longestkSubstr(String s, int key) {
        // code here
        int j=0;
        int res=0;
        int resmax=Integer.MIN_VALUE;
        HashMap<Character,Integer> freq=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            res++;
            if(!freq.containsKey(s.charAt(i)))
                freq.put(s.charAt(i),1);
            else{
                freq.put(s.charAt(i),freq.get(s.charAt(i))+1);
            }
            while(freq.size()>key){
                removeFreq(freq,s.charAt(j));
                j++;
                res--;
            }
            resmax= Math.max(resmax,res);
        }

        //freq.forEach((k,v)-> System.out.println(k+" "+v));
        if(freq.size()!=key) return -1;
        return resmax;

    }



    void removeFreq(HashMap<Character,Integer> freq,Character c){
        if(freq.containsKey(c)){
            if(freq.get(c)==1){
                freq.remove(c);
            }
            else{
                freq.put(c,freq.get(c)-1);
            }
        }
    }
}
