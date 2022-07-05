package Model;

import java.util.Arrays;

public class Smartphone implements Radio, GPS{
    private String modellName, producerName;
    private Contact [] contactsArray;

//Constructor
    public Smartphone() {
    }

    public Smartphone(String modellName, String producerName, Contact[] contactsArray) {
        this.modellName = modellName;
        this.producerName = producerName;
        this.contactsArray = contactsArray;
    }

    //:::::::::::::::interface implemention
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


    //::::::::::::Getter Setter

    public String getModellName() {
        return modellName;
    }

    public void setModellName(String modellName) {
        this.modellName = modellName;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public Contact[] getContactsArray() {
        return contactsArray;
    }

    public void setContactsArray(Contact[] contactsArray) {
        this.contactsArray = contactsArray;
    }


    @Override
    public String toString() {
        return "Smartphone{" +
                "modellName='" + modellName + '\'' +
                ", producerName='" + producerName + '\'' +
                ", contactsArray=" + Arrays.toString(contactsArray) +
                '}';
    }
}
