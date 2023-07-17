package model;
/**
 * Перечисление видов коробки передач автомобиля
 */
public enum TransmissionType {
    AT("Автоматическая коробка передач"), MT("Механическая коробка передач");

    private String type;
    TransmissionType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
