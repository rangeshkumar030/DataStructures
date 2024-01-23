package org.example.testPassingRef;

public class Response {
    String a;
    String b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Response{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
