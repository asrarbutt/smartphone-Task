import Model.Radio;
import Model.Smartphone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmartphoneTest {

    Smartphone smartphone=new Smartphone();

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
}
