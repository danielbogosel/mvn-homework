package ro.itschool.mvnbase.tema13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExamResultReader {
    private final List<ExamResult>docList;

    public ExamResultReader(String path)throws IOException {
        this.docList=fetchFile(path);

    }

    private List<ExamResult> fetchFile(String path)throws IOException {
        List<ExamResult>result=new ArrayList<>();
        BufferedReader breader = new BufferedReader(new FileReader(new File(path)));
        String line=breader.readLine();
        String splitString[];
        while (line!=null){
            splitString=line.split("|");
            result.add(new ExamResult(splitString[0],splitString[1]));
            line=breader.readLine();
        }

        return result;
    }

    @Override
    public String toString() {
        return "OUT:" + '\n' + docList;
    }
}
