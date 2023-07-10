package Classes.rewards;

import Classes.IGameItem;
import Classes.ItemFabric;

public class BronzeGenerator extends ItemFabric {
    @Override
    public IGameItem createItem() {
        return new BronzeReward();
    }
}
