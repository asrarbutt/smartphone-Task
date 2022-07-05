import Model.BuisnessContact;
import Model.Contact;
import Model.Friend;
import Model.Smartphone;

public class Main {

    public static void main(String[] args) {


        BuisnessContact buisnessContact=new BuisnessContact();
        Friend friend=new Friend();
        Contact contact=friend;
        System.out.println(buisnessContact.addContact(contact));

    }
}
