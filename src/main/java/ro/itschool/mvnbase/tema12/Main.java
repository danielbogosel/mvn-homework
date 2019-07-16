package ro.itschool.mvnbase.tema12;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        List<Document> documents = new ArrayList<>();
        documents.addAll(List.of(
                new Document(UUID.randomUUID().toString(), "Povestea Anei", "Ana are mere"),
                new Document(UUID.randomUUID().toString(), "Povestea lui Andrei", "Andrei bate mingea"),
                new Document(UUID.randomUUID().toString(), "Povestea lui Mihai", "Mihai fuge")
        ));
        DocumentServices documentService = new DocumentServices(documents);
        System.out.println(documentService.getAll());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(documentService.getByName("Povestea Anei"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(documentService.getById("Povestea Anei"));
        Optional<Document> doc=documentService.getByName("Povestea Anei");
    }
}
