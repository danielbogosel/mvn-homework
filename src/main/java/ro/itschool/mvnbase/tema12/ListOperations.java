package ro.itschool.mvnbase.tema12;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    private final List<String>first;
    private final List<String>secound;

    public ListOperations(List<String> first,List<String> secound) {
        this.first = new ArrayList<>(first);
        this.secound=new ArrayList<>(secound);
    }

}
