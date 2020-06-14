
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
public class CalcParameterizedTest {
    private double num1;
    private double num2;
    private double result;

    public CalcParameterizedTest(double num1, double num2, double result){
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    @Parameterized.Parameters(name = "{index}")
    public static Iterable<Object[]> dataForTest(){
        return Arrays.asList(new Object[][]{
                {1.2, 0.4, 1.6},
                {10.3, 2, 12.3},
                {10, 2.7, 12.7}
        });
    }

    @Test
    public void parameterizedTest(){
        assertEquals(result, Calc.add(num1, num2));
    }
}