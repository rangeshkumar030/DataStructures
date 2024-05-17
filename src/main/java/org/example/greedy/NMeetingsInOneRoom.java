package org.example.greedy;


import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1
public class NMeetingsInOneRoom {
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        Meeting[] meetings=new Meeting[n];
        for (int i = 0; i < n; i++) {
            meetings[i]=new Meeting();
            meetings[i].start=start[i];
            meetings[i].end=end[i];
        }
        Arrays.sort(meetings,(meeting1,meeting2)-> meeting1.end-meeting2.end);

       int count=0;
       int endtime=0;
        for (int i = 0; i < n; i++) {
            if(meetings[i].start>endtime){
                count++;
                endtime=meetings[i].end;
                System.out.println(meetings[i].end);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxMeetings(new int[]{1,3,0,5,8,5},new int[]{2,4,6,7,9,9},6));
    }
}
class Meeting{
    int start;
    int end;
}
