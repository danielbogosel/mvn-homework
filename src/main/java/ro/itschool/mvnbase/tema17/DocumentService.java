package ro.itschool.mvnbase.tema17;

import java.util.ArrayList;
import java.util.List;

public class DocumentService {
    private final List<Document> documents;

    public DocumentService(List<Document> documents) {
        this.documents = new ArrayList<>(documents);
    }

    public List<Document> getDocuments() {
        return new ArrayList<>(documents);
    }

    public List<Document> getInProgressDocuments() {
        List<Document> result = new ArrayList<>();
        for (Document doc : documents) {
            if (doc.getStatus() == Status.IN_PROGRESS) {
                result.add(doc);
            }

        }
        return result;
    }

    public List<Document> getFailedDocuments() {
        List<Document> result = new ArrayList<>();
        for (Document doc : documents) {
            if (doc.getStatus() == Status.FAILED) {
                result.add(doc);
            }

        }
        return result;
    }

    public Document startDocument(String documentId) throws DocumentAlreadyFinishedException {
        List<Document> clone = new ArrayList<>(getDocuments());
        for (Document doc : clone) {
            if (doc.getStatus() == Status.SUCCESS || doc.getStatus() == Status.FAILED) {
                throw new DocumentAlreadyFinishedException();
            } else {
                if (doc.getDocumentId() == documentId) {
                    doc.setStatus(Status.IN_PROGRESS);
                    return doc;
                }
            }
        }

        return null;
    }

    public Document completeDocument(String documentId) throws DocumentAlreadyFinishedException {
        List<Document> clone = new ArrayList<>(getDocuments());
        for (Document doc : clone) {
            if (doc.getDocumentId() == documentId) {
                if (doc.getStatus() != Status.IN_PROGRESS) {
                    throw new DocumentAlreadyFinishedException(doc.getStatus());

                } else {
                    doc.setStatus(Status.SUCCESS);
                    return doc;
                }
            }
        }

        return null;
    }

    public Document failDocument(String documentId) throws DocumentAlreadyFinishedException {
        List<Document> clone = new ArrayList<>(getDocuments());
        for (Document doc : clone) {
            if (doc.getDocumentId() == documentId) {
                if (doc.getStatus() != Status.IN_PROGRESS) {
                    throw new DocumentAlreadyFinishedException(doc.getStatus());
                } else {
                    doc.setStatus(Status.FAILED);
                    return doc;
                }
            }
        }
        return null;
    }
}
