package ro.itschool.mvnbase.tema19;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RecursionLinearSearch implements SearchAlgo {
    @Override
    public boolean search(int[] elems, int elem) {
        if (elems == null) {
            return false;
        }
        if (elems.length == 0) {
            return false;
        }
        if (elems[0] == elem) {
            return true;
        }
        if (elems[elems.length - 1] == elem) {
            return true;
        } else {
            return search(Arrays.copyOfRange(elems, 0, elems.length - 1), elem);
        }

    }
}
