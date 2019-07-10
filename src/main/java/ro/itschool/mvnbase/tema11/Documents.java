package ro.itschool.mvnbase.tema11;

import java.util.List;

public class Documents {
    private final int idDocuments;
    private final String name;
    private final String content;
    private final List<Markup> markups;

    Documents(int idDocuments, String name, String content, List<Markup> markup) {
        this.idDocuments = idDocuments;
        this.name = name;
        this.content = content;
        this.markups = markup;
    }

    public int getIdDocuments() {
        return idDocuments;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public List<Markup> getMarkups() {
        return markups;
    }
}
