import Model.Contact;
import Model.Friend;
import Model.Radio;
import Model.Smartphone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmartphoneTest {

    Smartphone smartphone=new Smartphone();

    private Smartphone generateDummySmartphone(){
        Contact[] contacts={new Friend("Jan Hoffmann", +4917645), new Friend("Jan Hoffmann", +4917645)  };
        Smartphone smartphone1=new Smartphone("S22", "Samsung", contacts);
        return smartphone1;
    }

    @Test
    void startRadioTest(){
        //given
        boolean startRadio=true;

        //when
        boolean actual=smartphone.startRadio();
        boolean exspected=true;

        //then
        Assertions.assertEquals(exspected, actual);


    }

    @Test
    void stoppRadioTest(){
        //given
        boolean startRadio=true;

        //when
        boolean actual=smartphone.startRadio();
        boolean exspected=false;

        //then
        Assertions.assertEquals(exspected, actual);
    }

    @Test
    void gpsPositionTest(){
        //given
        String position="Hamburg";

        //when
        String actual=smartphone.getPosition(position);
        String exspected="Hamburg";

        //then
        Assertions.assertEquals(exspected, actual);
    }

    @Test
    void toStringTest(){

        //given
        Smartphone smartphone=new Smartphone("S21","Samsung", (new Contact[]{new Friend("Ali", 123), new Friend("Jan", 123)}));



        //when
        String actual=smartphone.toString();
        String expected="Smartphone{modellName='S21', producerName='Samsung', contactsArray=[Friend{telNumber=123, contactName='Ali'}, Friend{telNumber=123, contactName='Jan'}]}";

        //then
        Assertions.assertEquals(expected, actual);


    }
}
