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


}