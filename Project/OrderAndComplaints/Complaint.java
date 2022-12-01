//Object Oriented Analytics and Design Project
//Made by:  Piotr Kimmel B00087671
//          Samuel Khan B00123689
//          Noel Kelly B00132291
//          Daniel Ikomi B00147691

package OrderAndComplaints;

import People.Customer;

public final class Complaint extends Customer {

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

    @Override
    public String toString() {
        return "complaint='" + complaint + ", resolved=" + resolved;
    }
}
