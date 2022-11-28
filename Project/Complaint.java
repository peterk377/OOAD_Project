public final class Complaint extends Customer{

    private String complaint;
    private boolean resolved = false;

    public String getComplaint() {
        return this.complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public boolean isResolved() {
        return this.resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }
}
