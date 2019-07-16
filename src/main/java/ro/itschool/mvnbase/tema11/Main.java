package ro.itschool.mvnbase.tema11;

import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        List<Documents>documentsList=List.of(
                new Documents(UUID.randomUUID().toString(), "Povestea lui Pni", "Pni are pere"),
                new Documents(UUID.randomUUID().toString(), "Povestea lui Andrei", "AAndrei are prune")
        );
        DocumentService documentService=new DocumentService(documentsList);
        List<Documents>docs=documentService.getAll();
        System.out.println(docs);
    }
}
