package ro.itschool.mvnbase.tema13.ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadAndPrint {
    private final List<String> docList;

    public ReadAndPrint(String path) throws IOException {
        this.docList = fetchFile(path);
    }

    private List<String> fetchFile(String path) throws IOException {
        List<String> result = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        String line = br.readLine();
        if (line != null) {
            result.add(line);
            line = br.readLine();
        }
        return result;

    }

    @Override
    public String toString() {
        return  "OUT :"+'\n'+docList+ '\n';

    }
}
