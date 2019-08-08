package ro.itschool.mvnbase.tema19;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RecursionLinearSearchTest {
    private static Stream<Arguments> searchAlgos() {
        return Stream.of(
                Arguments.of(new RecursionLinearSearch())

        );

    }

    @ParameterizedTest
    @MethodSource("searchAlgos")
    @DisplayName("existing element")
    void existingElement(SearchAlgo searchAlgos) {
        assertTrue(searchAlgos.search(new int[]{1, 2, 3, 4, 5, 6}, 6));
    }

    @ParameterizedTest
    @MethodSource("searchAlgos")
    @DisplayName("nonexisting element")
    void nonExistingElement(SearchAlgo searchAlgos) {
        assertFalse(searchAlgos.search(new int[]{1, 2, 3, 4, 5, 6}, 86));
    }

    @ParameterizedTest
    @MethodSource("searchAlgos")
    @DisplayName("null Array")
    void nullarray(SearchAlgo searchAlgos) {
        assertFalse(searchAlgos.search(null, 86));
    }

    @ParameterizedTest
    @MethodSource("searchAlgos")
    @DisplayName("empty Array")
    void emptyArray(SearchAlgo searchAlgos) {
        assertFalse(searchAlgos.search(new int[]{}, 86));
    }

}