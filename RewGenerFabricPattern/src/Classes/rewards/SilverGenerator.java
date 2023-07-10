package Classes.rewards;

import Classes.IGameItem;
import Classes.ItemFabric;

public class SilverGenerator extends ItemFabric {
    @Override
    public IGameItem createItem() {
        return new SilverReward();
    }
}
