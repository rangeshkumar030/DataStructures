package org.example.dynamicprogramming;


import java.util.Arrays;

//https://leetcode.com/problems/best-team-with-no-conflicts/
public class BestTeamWithNoConflicts {
    public static int bestTeamScore(int[] scores, int[] ages) {
        if(scores.length==1) return scores[0];
        Score sc[]=new Score[scores.length];
        int[] dp=new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            sc[i]=new Score( scores[i],ages[i]);
        }
        Arrays.sort(sc, (sc1, sc2) -> {
            if(sc1.age!=sc2.age) return sc1.age-sc2.age;
            else return sc1.score-sc2.score;
        });

        int max=Integer.MIN_VALUE;
        dp[0]=sc[0].score;
        for (int i = 1; i < dp.length; i++) {
            dp[i]=sc[i].score;
            for (int j = 0; j < i; j++) {
                if(sc[j].score<=sc[i].score) {
                    dp[i] = Math.max(dp[i], sc[i].score + dp[j]);
                }
            }
            max=Math.max(max,dp[i]);

        }
        /*for (int i = 0; i <sc.length ; i++) {
            System.out.println(sc[i]);
        }*/
        return max;
    }



    public static void main(String[] args) {
        System.out.println(bestTeamScore(new int[]{9,2,8,8,2},new int[]{4,1,3,3,5}));
    }
}
class Score{
    @Override
    public String toString() {
        return "" + score + " " + age ;
    }

    public Score(int score, int age) {
        this.score = score;
        this.age = age;
    }

    int score;
    int age;
}
