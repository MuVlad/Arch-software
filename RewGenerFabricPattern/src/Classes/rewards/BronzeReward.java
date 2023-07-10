package Classes.rewards;

import Classes.IGameItem;

public class BronzeReward implements IGameItem {
    @Override
    public void open() {
        System.out.println("Bronze");
    }
}
