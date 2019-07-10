package ro.itschool.mvnbase.tema11;

public class Markup {
    private final int documentId;
    private final int position;
    private final String content;

    Markup(int documentId, int position, String content){
        this.documentId=documentId;
        this.position=position;
        this.content=content;
    }

    public int getDocumentId(){
        return documentId;
    }
    public  int getPosition(){
        return position;
    }
    public String getContent(){
        return content;
    }
}
