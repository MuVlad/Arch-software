package model;

/**
 * Перечисление видов кузова автомобиля
 */
public enum CarBodyType {
    SEDAN("Седан"), HATCHBACK("Хэтчбек"), LIMOUSINE("Лимузин"), LIFTBACK("Лифтбек"),
    WAGON("Универсал"), PICKUP("Пикап"), COUPE("Купе"), CABRIOLET("Кабриолет")
    ;

    private String type;
    CarBodyType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
