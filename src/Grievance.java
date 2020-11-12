import java.util.Date;

public class Grievance {
    public Grievance(String title, String greivance, int complaintee, boolean isResolved, Date submissiondate) {
        this.title = title;
        this.greivance = greivance;
        this.complaintee = complaintee;
        this.isResolved = isResolved;
        this.submissiondate = submissiondate;
        this.resolutionDate = null;
    }

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        assert title.length() > 0 && title.length() < 20;
        this.title = title;
    }

    public String getGreivance() {
        return greivance;
    }

    public void setGreivance(String greivance) {
        assert greivance.length() > 0;
        this.greivance = greivance;
    }

    public int getComplaintee() {
        return complaintee;
    }

    public void setComplaintee(int complaintee) {
        assert complaintee > 0;
        this.complaintee = complaintee;
    }

    public boolean isResolved() {
        return isResolved;
    }

    public void setResolved(boolean resolved) {
        isResolved = resolved;
    }

    public Date getSubmissiondate() {
        return submissiondate;
    }

    public void setSubmissiondate(Date submissiondate) {
        assert submissiondate != null;
        this.submissiondate = submissiondate;
    }

    public Date getResolutionDate() {
        return resolutionDate;
    }

    public void setResolutionDate(Date resolutionDate) {
        assert resolutionDate != null;
        this.resolutionDate = resolutionDate;
    }

    private String greivance;
    private int complaintee;
    private boolean isResolved;
    private Date submissiondate;
    private Date resolutionDate;
}
