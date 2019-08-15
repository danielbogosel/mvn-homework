package ro.itschool.mvnbase.tema21;

import java.time.LocalDateTime;
import java.util.Objects;

public class Job {
    private final String documentId;
    private LocalDateTime startDate;
    private LocalDateTime deadline;
    private Urgency urgency;

    public Job(String documentId, LocalDateTime startDate, LocalDateTime deadline, Urgency urgency) {
        this.documentId = documentId;
        this.startDate = startDate;
        this.deadline = deadline;
        this.urgency = urgency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return Objects.equals(documentId, job.documentId) &&
                Objects.equals(startDate, job.startDate) &&
                Objects.equals(deadline, job.deadline) &&
                Objects.equals(urgency, job.urgency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, startDate, deadline, urgency);
    }

    @Override
    public String toString() {
        return "Job{" +
                "documentId='" + documentId + '\'' +
                ", startDate=" + startDate +
                ", deadline=" + deadline +
                ", urgency=" + urgency +
                '}';
    }
}
