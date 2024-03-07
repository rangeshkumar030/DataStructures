package org.example.geeksamazon;
//https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1?page=1&company=Amazon&sortBy=submissions
public class FindMissingAndRepeating {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int freq[]=new int[n+1];
        int res[]=new int[2];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < n+1; i++) {
            if(freq[i]==0){
                res[0]=freq[i];
            }
            if(freq[i]==2){
                res[1]=freq[i];
            }
        }
        return res;
    }
}
