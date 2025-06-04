package org.example.strings;

public class MaxNumberWithKSwaps {

    public String findMaximumNum(String s, int k) {
        // code here.
        StringBuilder sb=new StringBuilder(s);
        int count=0;
         for (int i = 0; i < sb.length(); i++) {
             System.out.println(sb);
            char max=sb.charAt(i);
            int maxIndex=i;
            for (int j = i; j < sb.length(); j++) {
                if(max<sb.charAt(j)){
                    max=sb.charAt(j);
                    maxIndex=j;
                }
            }
             System.out.println(max+" "+maxIndex);
            if(maxIndex==i) continue;
            else{
                count++;
                char temp = sb.charAt(i);
                sb.setCharAt(i, s.charAt(maxIndex));
                sb.setCharAt(maxIndex, temp);
            }
            if(count==k) break;
        }
         return sb.toString();
    }
}
