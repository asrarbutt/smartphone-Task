import Model.BuisnessContact;
import Model.Contact;
import Model.Friend;
import Model.Smartphone;

public class Main {

    public static void main(String[] args) {

        BuisnessContact buisnessContact=new BuisnessContact();
        System.out.println(buisnessContact.addContact(new Friend("hallo", 1232)));


    }
}
