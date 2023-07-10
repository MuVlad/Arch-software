package Classes.rewards;

import Classes.IGameItem;
import Classes.ItemFabric;

public class CoinGenerator extends ItemFabric {
    @Override
    public IGameItem createItem() {
        return new CoinReward();
    }
}
