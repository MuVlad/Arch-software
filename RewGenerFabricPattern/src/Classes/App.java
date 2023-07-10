package Classes;


import Classes.rewards.*;

public class App {
    public static void main(String[] args) {
        ItemFabric generator = new GoldGenerator();
        generator.openReward();
        generator = new GemGenerator();
        generator.openReward();
        generator = new SilverGenerator();
        generator.openReward();
        generator = new CoinGenerator();
        generator.openReward();
        generator = new NFTGenerator();
        generator.openReward();
        generator = new BronzeGenerator();
        generator.openReward();
        generator = new BitcoinGenerator();
        generator.openReward();
    }
}
