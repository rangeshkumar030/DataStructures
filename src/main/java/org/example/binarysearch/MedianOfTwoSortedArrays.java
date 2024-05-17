package org.example.binarysearch;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int min=(nums1[0]<nums2[0])?nums1[0]:nums2[0];
        int max=(nums1[0]>nums2[0])?nums1[0]:nums2[0];
        int mid1=1,mid2=1;
        while(min<max){
            int mid=min+(max-min)/2;
             mid1=findMedianSortedArrays(nums1,mid);
             mid2=findMedianSortedArrays(nums2,mid);
            if(mid1+mid2==(nums1.length+nums2.length)/2){
                break;
            }
            else if(mid1+mid2>(nums1.length+nums2.length)/2){
                max=mid-1;
            }
            else
                min=mid+1;
        }
        System.out.println(mid1+" "+mid2);
        return (nums1[mid1-1]>nums2[mid2-1])?nums1[mid1-1]:nums2[mid2-1];
    }

    public static int findMedianSortedArrays(int[] nums,int num) {
        int l=0,h=nums.length;
        while (l<h){
            int mid=l+(h-l)/2;
            if(nums[mid]<num){
                l=mid+1;
            }
            else{
                if(nums[mid-1]<=num){
                    return mid;
                }
                else{
                    h=mid-1;
                }
            }
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3,5},new int[]{2,4,6,8}));
    }
}
