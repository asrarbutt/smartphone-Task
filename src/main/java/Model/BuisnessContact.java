package Model;

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


    public Contact addContact(Contact contact){
        Smartphone smartphone=new Smartphone();
        Contact contact1=new Friend("w", 223);
        smartphone.setContactsArray(new Contact[]{new Friend("Ralf", 5555), new Friend("Ralf", 5555), new Friend("Ralf", 5555)});
        for (int i=0; i<smartphone.getContactsArray().length; i++){
            System.out.println(smartphone.getContactsArray()[i]);
        }

        return contact1;
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
}
