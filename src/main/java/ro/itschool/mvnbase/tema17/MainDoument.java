package ro.itschool.mvnbase.tema17;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MainDoument {
    public static void main(String[] args) throws DocumentAlreadyFinishedException {
        List<Document> documents = new ArrayList<>();
        documents.addAll(List.of(
                new Document("1", "doc1", Status.NEW),
                new Document("2", "doc2", Status.IN_PROGRESS),
                new Document("3", "doc3", Status.SUCCESS),
                new Document("4", "doc4", Status.IN_PROGRESS),
                new Document("5", "doc5", Status.FAILED),
                new Document("6", "doc6", Status.IN_PROGRESS),
                new Document("7", "doc7", Status.SUCCESS)

        ));
        DocumentService documentService = new DocumentService(documents);
        //System.out.println(documentService.getInProgressDocuments());
        //System.out.println(documentService.getFailedDocuments());
        System.out.println(documentService.startDocument("1"));
        System.out.println(documentService.completeDocument("2"));
        System.out.println(documentService.failDocument("6"));


    }

}
