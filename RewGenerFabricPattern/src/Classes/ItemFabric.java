package Classes;

public abstract class ItemFabric {

    public void openReward() {
        IGameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract IGameItem createItem();
}
