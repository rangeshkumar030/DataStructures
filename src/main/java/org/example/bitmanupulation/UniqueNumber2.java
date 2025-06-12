package org.example.bitmanupulation;


//https://leetcode.com/problems/single-number-iii/
public class UniqueNumber2 {

    public static int[] singleNum(int[] arr) {

        int xorVal = 0;
        for (int i : arr) {
            xorVal ^= i;
        }

        xorVal &= -xorVal;

        int[] res = new int[2];

        for (int num : arr) {

            if ((num & xorVal) == 0) {
                res[0] ^= num;
            }

            else {
                res[1] ^= num;
            }
        }
        if (res[0] > res[1]) {
            int temp = res[0];
            res[0] = res[1];
            res[1] = temp;
        }

        return res;
    }
}
