package Model;

public class Friend extends Contact{

    int telNumber;

    public Friend() {
    }


    public Friend(String contactName, int telNumber) {
        super(contactName);
        this.telNumber = telNumber;
    }

    @Override
    public void getName() {

    }

    @Override
    public String toString() {
        return "Friend{" +
                "telNumber=" + telNumber +
                ", contactName='" + contactName + '\'' +
                '}';
    }
}
