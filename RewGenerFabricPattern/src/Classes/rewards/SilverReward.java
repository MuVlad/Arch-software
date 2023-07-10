package Classes.rewards;

import Classes.IGameItem;

public class SilverReward implements IGameItem {
    @Override
    public void open() {
        System.out.println("Silver");
    }
}
