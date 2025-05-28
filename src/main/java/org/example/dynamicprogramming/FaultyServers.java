package org.example.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class FaultyServers {

    public static int countFaults(int n, List<String> logs){
        int count=0;
        int faults[]=new int[n+1];
        for (int i = 0; i < logs.size(); i++) {
            String log[]=logs.get(i).split(" ");
            int a=Integer.parseInt(log[0].substring(1,log[0].length()));
            if(log[1].charAt(0)=='e'){
                if(faults[a]!=2)
                    faults[a]++;
                else{
                    faults[a]=0;
                    count++;
                }

            }
            else{
                faults[a]=0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
       int n= countFaults(2, List.of(new String[]{"s1 error", "s1 error", "s2 error", "s1 error", "s1 error", "s1 success", "s2 error", "s2 error", "s2 error", "s1 success"}));
        System.out.println(n);
    }

}
