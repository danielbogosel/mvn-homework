package ro.itschool.mvnbase.tema12;

import java.util.Objects;

public class Markups {
    private final String markupId;
    private final int position;
    private final String content;

    public Markups(String markupId, int position, String content) {
        this.markupId = markupId;
        this.position = position;
        this.content = content;
    }

    public String getMarkupId() {
        return markupId;
    }

    public int getPosition() {
        return position;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Markups markups = (Markups) o;
        return position == markups.position &&
                Objects.equals(markupId, markups.markupId) &&
                Objects.equals(content, markups.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(markupId, position, content);
    }

    @Override
    public String toString() {
        return "Markups{" +
                "markupId='" + markupId + '\'' +
                ", position=" + position +
                ", content='" + content + '\'' +
                '}';
    }
}
