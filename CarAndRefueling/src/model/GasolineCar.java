package model;

/**
 *  Машина с бензиновым двигателем
 */
public class GasolineCar extends Car implements RefuelingStation{
    private RefuelingStation station = new RefuelinGasolinegStation();

    public GasolineCar(String brand, String model, String color, CarBodyType carBodyType, int countWheels, TransmissionType transmissionType, double engine_displacement) {
        super(brand, model, color, carBodyType, countWheels, FuelType.GASOLINE, transmissionType, engine_displacement);
    }

    @Override
    public void movement() {
        System.out.println("Машина запущенна");
    }

    @Override
    public void maintenance() {
        System.out.println("Машина обслуживается");

    }

    @Override
    public void gearChange() {
        System.out.println("Скорость переключена");
    }

    @Override
    public void refueling() {
        station.refueling();
    }
}
