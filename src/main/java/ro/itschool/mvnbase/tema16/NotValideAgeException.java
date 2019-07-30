package ro.itschool.mvnbase.tema16;

public class NotValideAgeException extends Exception {

    public NotValideAgeException(){
        super("You enter 0 or a negative age");
    }
    public NotValideAgeException(int invalideAge){
        super("Age"+invalideAge+"is not a valide age");
    }

}
