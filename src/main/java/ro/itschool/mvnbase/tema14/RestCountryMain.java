package ro.itschool.mvnbase.tema14;

public class RestCountryMain {
    public static void main(String[] args) {
        RestCountrySource restCountrySource = new RestCountrySource();
        System.out.println(restCountrySource.getDocuments());

    }
}
