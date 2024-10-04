package test;

import main.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        System.out.println("Hello Calculator");
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Bye Calculator");
        calculator = null;
    }

    @Test
    @DisplayName("Hello Evaluate")
    void evaluate() {
        System.out.println("Hello Evaluate Test Calculator");
        assertEquals(6, calculator.evaluate("1+2+3"));

    }
}