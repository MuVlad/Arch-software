package Classes.rewards;

import Classes.IGameItem;

public class NFTReward implements IGameItem {
    @Override
    public void open() {
        System.out.println("NFT");
    }
}
