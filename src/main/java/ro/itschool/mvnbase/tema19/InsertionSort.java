package ro.itschool.mvnbase.tema19;

public class InsertionSort implements SortingAlgo {
    @Override
    public int[] sort(int[] elems) {
        if (elems == null) {
            return null;
        }
        if (elems.length == 0) {
            return new int[]{};
        }
        for (int i = 0; i < elems.length; i++) {
            int compare = elems[i];
            int j = i - 1;

            while (j >= 0 && elems[j] > compare) {
                elems[j + 1] = elems[j];
                j = j - 1;
            }
            elems[j + 1] = compare;
        }

        return elems;
    }
}
