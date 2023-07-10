package Classes.rewards;

import Classes.IGameItem;

public class CoinReward implements IGameItem {
    @Override
    public void open() {
        System.out.println("Coin");
    }
}
