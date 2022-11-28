public class Customer extends Person{

    private String homeAddress;
    private String cardNo;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public void setPhone(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getHomeAddress() {
        return this.homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "homeAddress='" + homeAddress + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
