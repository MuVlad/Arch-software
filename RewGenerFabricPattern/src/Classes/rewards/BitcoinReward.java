package Classes.rewards;

import Classes.IGameItem;

public class BitcoinReward implements IGameItem {
    @Override
    public void open() {
        System.out.println("Bitcoin");
    }
}
