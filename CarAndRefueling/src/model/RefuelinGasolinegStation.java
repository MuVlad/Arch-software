package model;
//Заправочная станция бензиновым топливом
public class RefuelinGasolinegStation implements RefuelingStation{
    @Override
    public void refueling() {
        System.out.println("Машина заправлена бензином");
    }
}
