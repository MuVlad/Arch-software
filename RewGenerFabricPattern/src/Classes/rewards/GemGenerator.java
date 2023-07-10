package Classes.rewards;

import Classes.IGameItem;
import Classes.ItemFabric;

public class GemGenerator extends ItemFabric {
    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
}
