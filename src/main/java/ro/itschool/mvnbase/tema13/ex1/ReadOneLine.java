package ro.itschool.mvnbase.tema13.ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadOneLine {
    private final List<String>lineList;

    public ReadOneLine(String path)throws IOException{
        this.lineList=fetchDocument(path);
    }

    private List<String> fetchDocument(String path) throws IOException {
        List<String>result=new ArrayList<>();
        BufferedReader breader =new BufferedReader(new FileReader(new File(path)));
        String line =breader.readLine();
        if (line != null) {
            result.add(line);

        }
        return result;
    }

    @Override
    public String toString() {
        return "OUT:"+'\n'+lineList;
    }
}
