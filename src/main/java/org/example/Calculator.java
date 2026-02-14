package org.example;
interface CalculatorInterface {
          public double plus (double a, double b);
          public double minus(double a, double b);
          public double multiply(double a, double b);
          public double divide(double a, double b);
}

public class Calculator implements CalculatorInterface {
    public double plus (double a, double b){
        return a+b;
    };
    public double minus(double a, double b){
        return a-b;
    };
    public double multiply(double a, double b){
        return a*b;
    };
    public double divide(double a, double b){
        return a/b;
    };
}
