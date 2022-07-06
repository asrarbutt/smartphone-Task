package Model;

import java.util.Objects;

public class BuisnessContact extends Contact {

    private String companyName;



    public BuisnessContact(String companyName) {
        this.companyName = companyName;
    }
    public BuisnessContact( ) {

    }

    public BuisnessContact(String contactName, String companyName) {
        super(contactName);
        this.companyName = companyName;
    }

    // method from intermediate task


    public Contact[] addContact(Contact contact){


        Smartphone smartphone=new Smartphone();
        Contact contact1=new Friend("w", 223);

        Contact[] newContacts=new Contact[5];

        for (int i=0; i<smartphone.getContactsArray().length; i++){
            newContacts[i]=smartphone.getContactsArray()[i];
            System.out.println(newContacts[i]);
        }




        return newContacts ;
    }


    //Getter Setter

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    //extend  Method from Contact
    @Override
    public String getName(String contactName) {
        return null;
    }


    @Override
    public String toString() {
        return "BuisnessContact{" +
                "companyName='" + companyName + '\'' +
                ", contactName='" + contactName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuisnessContact that = (BuisnessContact) o;
        return Objects.equals(companyName, that.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName);
    }
}
