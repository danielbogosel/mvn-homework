package ro.itschool.mvnbase.tema18;

public class BadCharacterException extends Exception {
    public BadCharacterException(){
        super("You ENTER an invalide character");
    }
}
