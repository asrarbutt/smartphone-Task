package Model;

public class Smartphone implements Radio, GPS{
    private String modellName, producerName;
    private Contact [] contactsArray;



    @Override
    public String getPosition(String position) {
        System.out.println("hamburg");
        return position;
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");

        return false;
    }
}
