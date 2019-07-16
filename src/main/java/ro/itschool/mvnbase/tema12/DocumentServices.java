package ro.itschool.mvnbase.tema12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DocumentServices {
    private final List<Document> documents;

    public DocumentServices(List<Document> documents) {
        this.documents = new ArrayList<>(documents);
    }

    public List<Document> getAll() {
        return new ArrayList<>(documents);
    }
    public void addDocument(Document doc) {
        documents.add(doc);
    }

    public Optional<Document> getByName(String name) {
        for (Document docs : documents)
            if (docs.getName().equals(name)) {
                return Optional.of(docs);
            }
        return Optional.empty();
    }
    public Optional<Document> getById(String id) {
        for (Document docs : documents)
            if (docs.getIdDocument().equals(id)) {
                return Optional.of(docs);
            }
        return Optional.empty();
    }

    public void addMarkupsForDocuments(Markups markups,String id){
        Optional<Document>document= getById(id);
        if(document.isPresent()){
            document.get().addMarkup(markups);
        }

    }
    public List<Markups>getMarkupForDocument(String docId){
        Optional<Document> document =getById(docId);
        if(document.isPresent()) {
            return document.get().getMarkups();
        }else
            return Collections.emptyList();
    }
}
