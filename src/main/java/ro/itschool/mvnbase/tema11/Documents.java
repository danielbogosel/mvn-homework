package ro.itschool.mvnbase.tema11;

import java.util.ArrayList;
import java.util.List;

public class Documents {
    private final String idDocuments;
    private final String name;
    private final String content;
    private final List<Markup> markups;

    Documents(String idDocuments, String name, String content) {
        this.idDocuments = idDocuments;
        this.name = name;
        this.content = content;
        this.markups = new ArrayList<Markup>();
    }

    public String getIdDocuments() {
        return idDocuments;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public List<Markup> getMarkups() {
        return new ArrayList<>(markups);
    }
}
