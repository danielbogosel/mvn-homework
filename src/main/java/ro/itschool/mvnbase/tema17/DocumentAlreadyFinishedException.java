package ro.itschool.mvnbase.tema17;

public class DocumentAlreadyFinishedException extends Exception {

    public DocumentAlreadyFinishedException() {
        super("Document has already finished");
    }

    public DocumentAlreadyFinishedException(Status status) {
        super("Document status is "+status);
    }
}
