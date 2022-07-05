import Model.Friend;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FriendTest {

    Friend friend=new Friend();

    @Test
    void contactNameTest(){

        //überprüfen durch dirket eingabe???
        //given
        String contactName="Wali";


        //when
        String actual= friend.getName(contactName);
        String expacted="Wali";

        //then
        Assertions.assertEquals(expacted, actual);
    }
}
