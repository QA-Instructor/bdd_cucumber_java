import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperatorUnitTests {

    @Test
    public void add_operator_results_in_addition(){
        // ARRANGE
        int a = 2;
        int b = 4;
        Number expectedAnswer = 6.0;
        Calculator calc = new Calculator();
        // ACT
        calc.push(a);
        calc.push(b);
        calc.push("+");
        Number actualAnswer = calc.value();
        // ASSERT
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void unknown_operator_results_in_addition(){
        // ARRANGE
        int a = 2;
        int b = 4;
        Number expectedAnswer = 6.0;
        Calculator calc = new Calculator();
        // ACT
        calc.push(a);
        calc.push(b);
        calc.push("?");
        Number actualAnswer = calc.value();
        // ASSERT
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Disabled
    @Test
    public void subtract_operator_results_in_addition(){
        // ARRANGE
        int a = 10;
        int b = 30;
        Number expectedAnswer = 40.0;
        Calculator calc = new Calculator();
        // ACT
        calc.push(a);
        calc.push(b);
        calc.push("-");
        Number actualAnswer = calc.value();
        // ASSERT
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test
    public void subtract_operator_results_in_subtraction(){
        // ARRANGE
        int a = 6;
        int b = 10;
        Number expectedAnswer = 4.0;
        Calculator calc = new Calculator();
        // ACT
        calc.push(a);
        calc.push(b);
        calc.push("-");
        Number actualAnswer = calc.value();
        // ASSERT
        assertEquals(expectedAnswer, actualAnswer);
    }
}
