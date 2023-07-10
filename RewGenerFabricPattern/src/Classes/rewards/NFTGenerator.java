package Classes.rewards;

import Classes.IGameItem;
import Classes.ItemFabric;

public class NFTGenerator extends ItemFabric {
    @Override
    public IGameItem createItem() {
        return new NFTReward();
    }
}
