package org.example.dynamicprogramming;


//https://leetcode.com/problems/furthest-building-you-can-reach/description/
public class FurthestBuildingYouCanReach {

    public static int  furthestBuilding(int[] heights, int bricks, int ladders) {
        int dp[]=new int[heights.length];
        return furthestBuilding(heights,bricks,ladders,0,dp);
    }

    public static int  furthestBuilding(int[] heights, int bricks, int ladders,int i,int dp[]) {


        if(dp[i]!=0) return dp[i];
        else if(i>=heights.length-1) {
            System.out.println("here1 "+i+" "+bricks+" "+ladders);
            return 0;
        }
        else if (heights[i+1]<=heights[i]) {
            System.out.println("here2 "+i+" "+bricks+" "+ladders);
            dp[i]=1+furthestBuilding(heights,bricks,ladders,i+1,dp);
            return dp[i];
        }
        else if(bricks==0 && ladders==0){
            System.out.println("here3 "+i+" "+bricks+" "+ladders);
            return 0;
        }
        else if (bricks>heights[i+1]-heights[i] && ladders>0) {
            System.out.println("here4 "+i+" "+bricks+" "+ladders);
            dp[i]= 1+Math.max(furthestBuilding(heights,bricks-(heights[i+1]-heights[i]),ladders,i+1,dp),
                    furthestBuilding(heights,bricks,ladders-1,i+1,dp));
            return dp[i];
        } else if (ladders>0) {
            System.out.println("here5 "+i+" "+bricks+" "+ladders);
            dp[i]= 1+furthestBuilding(heights,bricks,ladders-1,i+1,dp);
            return dp[i];
        }
        else if(bricks>heights[i+1]-heights[i]){
            System.out.println("here6 "+i+" "+bricks+" "+ladders);
            dp[i]= 1+furthestBuilding(heights,bricks-(heights[i+1]-heights[i]),ladders,i+1,dp);
            return dp[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(furthestBuilding(new int[]{4,12,2,7,3,18,20,3,19},10,2));
    }

}
