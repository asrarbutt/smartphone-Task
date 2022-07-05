package Model;

public abstract class Contact {

    String contactName;

    public Contact() {
    }

    public Contact(String contactName) {
        this.contactName = contactName;
    }

    public abstract String getName(String contactName);
}
