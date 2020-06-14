import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;


import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void add() {
        assertEquals(6, Calc.add(4,2));
    }

    @Test
    void sub(){
        assertEquals(2, Calc.sub(8,6));
    }

    @Test
    void multiply(){
        assertEquals(12, Calc.multiply(4,3));
    }

    @Test
    void divide(){
        assertEquals(2, Calc.divide(4,2));
    }

    @Test
    void divideByZero(){
        assertThrows(IllegalArgumentException.class, () -> {
            Calc.divide(4,0);
        });
    }

    @Test
    void subctractionWithMinus(){
        assertEquals(-3, Calc.sub(2,5));
    }

    @Test
    void additionOfNegativeNumbers(){
        assertEquals(-15, Calc.add(-7,-8));
    }

    @Test
    void multiplyOfNegativeNumbers(){
        assertEquals(32, Calc.multiply(-8,-4));
    }

    @Test
    void divideOfNumbersWithDifferentSigns(){
        assertEquals(-9, Calc.divide(45,-5));
    }
}