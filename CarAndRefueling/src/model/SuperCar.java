package model;

/**
 * Класс супер машины, потомок класса Car
 */
public class SuperCar extends Car implements RefuelingStation{
    private RefuelingStation station = new RefuelingSuperFuelStation();
    private int maxSpeed;

    /**
     * Конструктор класса SuperCar
     * @param maxSpeed максимальная скорость
     */
    public SuperCar(String brand, String model, String color, CarBodyType carBodyType, int countWheels, FuelType fuelType, TransmissionType transmissionType, double engine_displacement, int maxSpeed) {
        super(brand, model, color, carBodyType, countWheels, fuelType, transmissionType, engine_displacement);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void movement() {
        System.out.println("Нажата кнопка запуска");
    }

    @Override
    public void maintenance() {
        System.out.println("Машиной обслуживают профессионалы");
    }

    @Override
    public void gearChange() {
        System.out.println("Нажат лепесток переключения скорости");
    }

    @Override
    public void refueling() {
        station.refueling();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
