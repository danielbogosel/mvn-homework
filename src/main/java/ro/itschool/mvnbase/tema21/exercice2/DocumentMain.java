package ro.itschool.mvnbase.tema21.exercice2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DocumentMain {
    public static void main(String[] args) {
        List<Document> documents = List.of(new Document("doc1", "1", Status.FAILED),
                new Document("doc2", "2", Status.IN_PROGRESS),
                new Document("doc3", "3", Status.NEW),
                new Document("doc4", "4", Status.IN_PROGRESS),
                new Document("doc5", "5", Status.SUCCESS),
                new Document("doc6", "6", Status.SUCCESS),
                new Document("doc7", "7", Status.NEW)
        );
        final List<String> successStatusDocs = documents.stream()
                .filter(document -> document.getStatus().equals(Status.SUCCESS))
                .map(document -> document.getDocumentId())
                .collect(Collectors.toList());
        successStatusDocs.forEach(document -> System.out.print(document + " "));
        System.out.println("");

       // documents.stream()
                //.filter(document -> document.getStatus().equals(Status.IN_PROGRESS))
                //.map(document -> new Job(document.getDocumentId()));

    }

}
