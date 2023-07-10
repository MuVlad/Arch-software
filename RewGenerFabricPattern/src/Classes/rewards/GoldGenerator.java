package Classes.rewards;

import Classes.IGameItem;
import Classes.ItemFabric;

public class GoldGenerator extends ItemFabric {

    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
}
