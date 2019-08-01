package ro.itschool.mvnbase.tema17.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberSumTest {
    @Test
    @DisplayName("1234=10")
    void generalTest(){
        NumberSum numberSum = new NumberSum();
        assertEquals(numberSum.numberSum(1234),10);
    }

}