package ro.itschool.mvnbase.tema14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CountryPrinter {
    private BufferedWriter docPrinter;
    private boolean opened;
    private String path;


    public CountryPrinter(String path) throws IOException {
        this.path = path;
        this.docPrinter = new BufferedWriter(new FileWriter(path));
        this.opened=true;
    }

    public void write(Country country)throws IOException{
        if(opened){
            docPrinter =openWithAppend();
        }

        docPrinter.write(String.format("The country of %s has capital in %s with a population of %s on an area of %s km2"
                , country.getName(), country.getCapital(), country.getPopulation(),country.getArea()));
        docPrinter.newLine();
        docPrinter.flush();

    }

    private BufferedWriter openWithAppend()throws IOException {
        return new BufferedWriter(new FileWriter(path, true));
    }

    public void close()throws IOException{
        opened=false;
        docPrinter.close();
    }
}
