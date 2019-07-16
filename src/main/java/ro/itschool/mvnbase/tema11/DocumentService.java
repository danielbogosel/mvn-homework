package ro.itschool.mvnbase.tema11;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

public class DocumentService {
    private final List<Documents> documents;

    DocumentService(List<Documents> document) {
        this.documents = document;
    }

    public List<Documents> getAll() {
        return new ArrayList<>(documents);
    }

}


