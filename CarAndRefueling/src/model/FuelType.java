package model;

/**
 * Перечисление видов топлива автомобиля
 */
public enum FuelType {
    GASOLINE("Бензин"), DIESEL("Дизель"), ELECTRICITY("Електричество"), GAS("Газ");

    private String type;
    FuelType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
