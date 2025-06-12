package org.example.strings;

public class KMPAlgorithmForPatternSearching {

    static void compareLPS(String s, int arr[]){
        int len=0;
        int i=1;
        int n=arr.length;
        arr[0]=0;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                arr[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=arr[len-1];
                }
                else{
                    arr[i]=0;
                    i++;
                }
            }
        }
    }


    boolean issubsctring(String s1,String s2, int rep){
        int n=s1.length();
        int m=s2.length();
        int lps[]=new int[m];
        compareLPS(s2,lps);
        int i=0,len=0;
        while(i<n*rep){
            if(s1.charAt(i%n)==s2.charAt(len)){
                i++;
                len++;
                if(len==m-1){
                    return true;
                }
            }
            else{
                if(len!=0)
                    len=lps[len-1];
                else i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s="abcabdabcabcabd";
        int arr[]=new int[s.length()];
        compareLPS(s,arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
