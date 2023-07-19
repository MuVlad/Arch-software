package Models;

import java.util.List;

/**
 * Модель перевозчика
 */
public class Carrier {

    private int id;
    private long cardNumber;
    List<Integer> zones;

    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public List<Integer> getZones() {
        return zones;
    }
}
