package ro.itschool.mvnbase.tema18;

public class Directory {
    public Directory() {
    }

    public static final String[] words = new String[]{"apa", "morcov", "sarmale", "telefon", "fasole","bujor","busuioc","electroliza","polen","macaroane"};


    protected String getWord(int wordNumber) {
        return words[wordNumber];
    }

    protected int getLength() {
        return words.length;
    }
}
