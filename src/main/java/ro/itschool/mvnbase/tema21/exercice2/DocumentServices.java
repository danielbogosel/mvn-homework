package ro.itschool.mvnbase.tema21.exercice2;

import java.util.ArrayList;
import java.util.List;

public class DocumentServices {
    public static void main(String[] args) {
        List<Document> documents = List.of(new Document("doc1", "1", Status.FAILED),
                new Document("doc2", "2", Status.IN_PROGRESS),
                new Document("doc3", "3", Status.NEW),
                new Document("doc4", "4", Status.IN_PROGRESS),
                new Document("doc5", "5", Status.SUCCESS),
                new Document("doc6", "6", Status.SUCCESS),
                new Document("doc7", "7", Status.NEW)
        );
        System.out.println(getInformation(documents, value -> value.getStatus() == Status.SUCCESS));

    }

    public static List<String> getInformation(List<Document> documents, DocFunction predicate) {
        List<String> result = new ArrayList<>();
        for (Document doc : documents) {
            if (predicate.apply(doc)) {
                result.add(doc.getDocumentId());
            }
        }
        return result;
    }

    @FunctionalInterface
    private interface DocFunction {
        boolean apply(Document value);
    }
}
