package ro.itschool.mvnbase.tema21.exercice2;

import java.util.Objects;

public class Document {
    private final String name;
    private final String documentId;
    private Status status;

    public Document(String name, String documentId, Status status) {
        this.name = name;
        this.documentId = documentId;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getDocumentId() {
        return documentId;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(name, document.name) &&
                Objects.equals(documentId, document.documentId) &&
                status == document.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, documentId, status);
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", documentId='" + documentId + '\'' +
                ", status=" + status +
                '}';
    }
}
