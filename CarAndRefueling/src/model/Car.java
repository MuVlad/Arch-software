package model;

/**
 * Абстрактный класс автомобиля.
 */
public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private CarBodyType bodyType;
    private int countWheels;
    private FuelType fuelType;
    private TransmissionType transmissionType;
    private double engine_displacement;

    /**
     * Конструктор класса Car
     * @param brand Марка автомобиля
     * @param model Модель автомобиля
     * @param color Цвет автомобиля
     * @param carBodyType Тип кузова
     * @param countWheels Колличество колес
     * @param fuelType Тип топлива
     * @param transmissionType Тип каробки передач
     * @param engine_displacement Объем двигателя
     */
    public Car(String brand, String model, String color, CarBodyType carBodyType, int countWheels, FuelType fuelType, TransmissionType transmissionType, double engine_displacement) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = carBodyType;
        this.countWheels = countWheels;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.engine_displacement = engine_displacement;
    }

    /**
     * абстрактный метод для старта машины, его реализация может различаться в разных автомобилях 
     */
    public abstract void movement();
    /**
     * абстрактный метод для обслуживания машины, его реализация может различаться в разных автомобилях
     */
    public abstract void maintenance();
    /**
     * абстрактный метод для переключения передач, необходима его реализация под разные типы коробки передач
     */
    public abstract void gearChange();
    /**
     * Метод для включения фар
     */
    public void headlightSwitch(){
        System.out.println("Фары включены");
    };
    /**
     * Метод для включения дворников
     */
    public void wiperActivation(){
        System.out.println("Дворники включены");
    };


    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public void setEngine_displacement(double engine_displacement) {
        this.engine_displacement = engine_displacement;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public CarBodyType getBodyType() {
        return bodyType;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public double getEngine_displacement() {
        return engine_displacement;
    }
}
