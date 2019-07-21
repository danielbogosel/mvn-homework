package ro.itschool.mvnbase.tema13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonFileReader {
    private final List<Person> docList;

    public PersonFileReader(String path) throws IOException {
        this.docList = fetchList(path);
    }

    public List<Person> getDocList() {
        return docList;
    }

    private List<Person> fetchList(String path) throws IOException {
        List<Person> result = new ArrayList<>();
        BufferedReader breader = new BufferedReader(new FileReader(new File(path)));
        String line;
        String splitSting[];
        while ((line=breader.readLine())!=null){
            splitSting=line.split("\\|");
            result.add(new Person(splitSting[0],splitSting[1],Integer.parseInt(splitSting[2])));

        }
        return result;

    }

    @Override
    public String toString() {
        return "OUT"+'\n' + docList ;

    }
}
