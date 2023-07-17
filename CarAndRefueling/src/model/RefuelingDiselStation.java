package model;

//Заправочная станция дизельным топливом
public class RefuelingDiselStation implements RefuelingStation  {
    @Override
    public void refueling() {
        System.out.println("Машина заправлена дизилем");
    }
}
