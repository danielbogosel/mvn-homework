package ro.itschool.mvnbase.tema17.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfZeroTest {
    @Test
    @DisplayName("0=1")
    void generalTest(){
        NumberOfZero numberOfZero = new NumberOfZero();
        assertEquals(numberOfZero.zeroCounter(0),1);
    }

}