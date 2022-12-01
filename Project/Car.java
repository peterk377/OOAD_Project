//Object Oriented Analytics and Design Project
//Made by:  Piotr Kimmel B00087671
//          Samuel Khan B00123689
//          Noel Kelly B00132291
//          Daniel Ikomi B00147691

import People.*;

public final class Car {

    private Customer owner;
    private String ownerName;
    private String make;
    private String carReg;
    private boolean manual = true;

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getCarReg() {
        return this.carReg;
    }

    public void setCarReg(String carReg) {
        this.carReg = carReg;
    }

    public boolean isManual() {
        return this.manual;
    }

    public void setManual(boolean manual) {
        this.manual = manual;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = owner.getName();
    }

    @Override
    public String toString() {
        return  "Owner=" + ownerName +
                ", make='" + make +
                ", carReg='" + carReg +
                ", manual=" + manual;
    }
}
