package ro.itschool.mvnbase.tema12;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Document {
    private final String idDocument;
    private final String name;
    private final String content;
    private final List<Markups>markups;


    public Document(String idDocument, String name, String content) {
        this.idDocument = idDocument;
        this.name = name;
        this.content = content;
        this.markups=new ArrayList<>();
    }

    public String getIdDocument() {
        return idDocument;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }
    public List<Markups> getMarkups(){
        return markups;
    }
    public void addMarkup(Markups markup) {
        markups.add(markup);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(idDocument, document.idDocument) &&
                Objects.equals(name, document.name) &&
                Objects.equals(content, document.content) &&
                Objects.equals(markups, document.markups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDocument, name, content, markups);
    }

    @Override
    public String toString() {
        return "Document{" +
                "idDocument='" + idDocument + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", markups=" + markups +
                '}'+'\n';
    }


}
