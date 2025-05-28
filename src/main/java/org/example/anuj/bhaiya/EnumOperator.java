package org.example.anuj.bhaiya;


import java.util.function.BiFunction;

public class EnumOperator {
    public static void main(String[] args) {
        System.out.println(Operator.ADD.apply(1,2));
    }
}



 enum Operator {
    ADD((a, b) -> a + b),
    SUBTRACT((a, b) -> a - b),
    MULTIPLY((a, b) -> a * b),
    DIVIDE((a, b) -> a / b);

    private final BiFunction<Double, Double, Double> operation;

    Operator(BiFunction<Double, Double, Double> operation) {
        this.operation = operation;
    }

    public double apply(double a, double b) {
        return operation.apply(a, b);
    }
}
