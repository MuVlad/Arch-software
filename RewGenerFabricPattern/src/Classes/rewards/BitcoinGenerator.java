package Classes.rewards;

import Classes.IGameItem;
import Classes.ItemFabric;

public class BitcoinGenerator extends ItemFabric {
    @Override
    public IGameItem createItem() {
        return new BitcoinReward();
    }
}
