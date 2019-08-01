package ro.itschool.mvnbase.tema17.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    @Test
    @DisplayName("abc=cba")
    void generalTest(){
        ReverseString reverseString = new ReverseString();
        assertEquals(reverseString.reverse("abc"),"cba");
    }
}