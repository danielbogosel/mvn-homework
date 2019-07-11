package ro.itschool.mvnbase.tema11;

import java.util.List;

public class DocumentService {
    private final List<Documents> documents;

    DocumentService(List<Documents> document) {
        this.documents = document;
    }

    public List<Documents> getAll() {
        return documents;
    }

}


