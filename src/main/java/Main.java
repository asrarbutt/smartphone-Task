import Model.Contact;
import Model.Friend;
import Model.Smartphone;

public class Main {

    public static void main(String[] args) {



        Smartphone smartphone=new Smartphone("S21","Samsung", (new Contact[]{new Friend("Ali", 123), new Friend("Jan")}) );

        System.out.println(smartphone);
    }
}
