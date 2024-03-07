package org.example.geeksamazon;

public class PeakElement {

    public int peakElement(int[] arr,int n)
    {
        //add code here.
        boolean peek=false;
        int index=0;
        for (int i = 0; i < n; i++) {
            if(peek==false && arr[index]<arr[i] ){
                index++;
                
            } else if (peek==false && arr[index]>=arr[i]) {
                peek = true;
            }
        }
        return index;
    }
}
