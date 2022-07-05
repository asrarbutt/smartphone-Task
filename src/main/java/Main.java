import Model.Contact;
import Model.Friend;
import Model.Smartphone;

public class Main {

    public static void main(String[] args) {

        Contact[] contacts={new Friend()};

        Smartphone smartphone=new Smartphone("S21","Samsung", (new Contact[]{new Friend("Ali")}) );

        System.out.println(smartphone);
    }
}
