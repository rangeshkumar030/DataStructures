package org.example.testPassingRef;

public class Sol {
    public static void main(String[] args) {
        Response res = new Response();
        populate(res);
        System.out.println(res);
    }

    private static void populate(Response res) {
        res.setA("aaaa");
        res.setB("bbbbbbbbbb");
    }
}
