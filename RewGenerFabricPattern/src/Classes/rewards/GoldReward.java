package Classes.rewards;

import Classes.IGameItem;

public class GoldReward implements IGameItem {

    @Override
    public void open() {
        System.out.println("Gold");
    }
}
