package org.example.arrays;

import java.util.*;

public class SolutionGeeks {

    public static int
    sortBasedOnFrequencyAndValue(List<Integer> arr, int m)
    {
        int n = arr.size();
        final HashMap<Integer, Integer> mapCount
                = new HashMap<Integer, Integer>();
        final HashMap<Integer, Integer> mapIndex
                = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (mapCount.containsKey(arr.get(i))) {
                mapCount.put(arr.get(i),
                        mapCount.get(arr.get(i)) + 1);
            }
            else {
                mapCount.put(
                        arr.get(i),
                        1); // Map to capture Count of elements
                mapIndex.put(arr.get(i),
                        i); // Map to capture 1st
                // occurrence of elements
            }
        }

        Collections.sort(arr, new Comparator<Integer>() {
            public int compare(Integer n1, Integer n2)
            {
                int freq1 = mapCount.get(n1);
                int freq2 = mapCount.get(n2);
                if (freq1 != freq2) {
                    return freq2 - freq1;
                }
                else {
                    return mapIndex.get(n1)
                            - mapIndex.get(
                            n2); // Elements with Lesser
                    // Index gets Higher
                    // Priority
                }
            }
        });
        System.out.println(arr);

        final HashMap<Integer, Integer> mapcount1
                = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.size()-m; i++) {
            if(!mapcount1.containsKey(arr.get(i))){
                mapcount1.put(arr.get(i),1);
            }
        }
        System.out.println(arr.size()-m);
        System.out.println(mapcount1);
        return mapcount1.size();

    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList();
        list.add(7);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);



        System.out.println(sortBasedOnFrequencyAndValue(list,3));
    }
}
