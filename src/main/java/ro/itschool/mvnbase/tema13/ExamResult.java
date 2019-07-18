package ro.itschool.mvnbase.tema13;

import java.util.Objects;


public class ExamResult {
    private final String name;
    private final String status;

    public ExamResult(String name,String status) {
        this.name = name;
        this.status=status;
    }


    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamResult that = (ExamResult) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status);
    }

    @Override
    public String toString() {
        return "ExamResult{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
