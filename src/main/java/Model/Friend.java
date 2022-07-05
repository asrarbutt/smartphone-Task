package Model;

public class Friend extends Contact{

    int telNumber;

    public Friend() {
    }

    @Override
    public String getName(String contactName) {
        return contactName;
    }

    public Friend(String contactName) {
        super(contactName);
    }

    public Friend(String contactName, int telNumber) {
        super(contactName);
        this.telNumber = telNumber;
    }



    @Override
    public String toString() {
        return "Friend{" +
                "telNumber=" + telNumber +
                ", contactName='" + contactName + '\'' +
                '}';
    }
}
