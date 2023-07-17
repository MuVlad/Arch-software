package model;

//Заправочная станция топлимо для супер машин
public class RefuelingSuperFuelStation implements RefuelingStation{
    @Override
    public void refueling() {
        System.out.println("Заправлено супер топливом");
    }
}
