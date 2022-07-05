package Model;

public class Smartphone implements Radio, GPS{
    private String modellName, producerName;
    private Contact [] contactsArray;



    @Override
    public String getPosition() {
        return null;
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return false;
    }

    @Override
    public boolean stopRadio() {
        return false;
    }
}
