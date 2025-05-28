package org.example.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MessageDeliverySystem {

    public static List<String> getMessageStatus(List<Integer> timeStamps , List<String> messages, int k ) {
        List<String> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < timeStamps.size(); i++) {
            if (!map.containsKey(messages.get(i))) {
                res.add("true");
                map.put(messages.get(i), timeStamps.get(i));
            } else {
                if (timeStamps.get(i) - map.get(messages.get(i)) <= k) {
                    res.add("false");
                } else {
                    res.add("true");
                }
                map.put(messages.get(i), timeStamps.get(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {

        List<Integer> timeStamps =new ArrayList<>();
        List<String> messages= new ArrayList<>();
        timeStamps.add(1);
        timeStamps.add(4);
        timeStamps.add(5);
        timeStamps.add(10);
        timeStamps.add(11);
        timeStamps.add(14);

        messages.add("Hello");
        messages.add("Bye");
        messages.add("Bye");
        messages.add("Hello");
        messages.add("Bye");
        messages.add("Hello");


        System.out.println(getMessageStatus(timeStamps,messages,5));
    }
}
