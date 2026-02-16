package org.example;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {
    @ParameterizedTest
    @CsvSource({ "5.0, 5.0, 10.0 ",
                 "6.0, 6.0, 12.0 ",
                 "8.0, 8.0, 16.0 ",
                 "9.0, 9.0, 18.0 "
    })
    public void testPlus(double a, double b, double result) {
        Calculator calculator = new Calculator();
        double pls = calculator.plus(a,b);

        Assertions.assertNotNull(pls);
        Assertions.assertEquals(result,pls);
    }
    @ParameterizedTest
    @CsvSource({ "5.0, 5.0, 0.0 ",
                 "12.0, 6.0, 6.0 ",
                 "16.0, 8.0, 8.0 ",
                 "18.0, 9.0, 9.0 "
    })
    public void testSubtract( double a, double b, double result ) {
        Calculator calculator = new Calculator();
        double mns = calculator.minus(a,b);

        Assertions.assertNotNull(mns);
        Assertions.assertEquals(result,mns);
    }
    @ParameterizedTest
    @CsvSource({ "5.0, 5.0, 25.0 ",
            "6.0, 6.0, 36.0 ",
            "8.0, 8.0, 64.0 ",
            "9.0, 9.0, 81.0 "
    })
    public void testMultiply( double a, double b, double result ) {
        Calculator calculator = new Calculator();
        double mltpl = calculator.multiply(a,b);

        Assertions.assertNotNull(mltpl);
        Assertions.assertEquals(result,mltpl);
    }
    @ParameterizedTest
    @CsvSource({ "25.0, 5.0, 5.0 ",
            "36.0, 6.0, 6.0 ",
            "64.0, 8.0, 8.0 ",
            "81.0, 9.0, 9.0 "
    })
    public void testDivide(double a, double b, double result ) {
        Calculator calculator = new Calculator();
        double dvd = calculator.divide(a,b);

        Assertions.assertNotNull(dvd);
        Assertions.assertEquals(result,dvd);
    }

}
