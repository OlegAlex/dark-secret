package Module.Store;

import Module.Main;
import Module.Store.flower.ChamomileFlower;
import Module.Store.flower.FlowersSaver;
import Module.Store.flower.RoseFlower;
import Module.Store.flower.TulipFlower;


public class FlowerStore implements Show {
    private int wallet;

    public FlowerStore() {
        this.wallet = 0;
    }

    public Bouquet sell(int roseCount, int chamomileCount, int tulipCount) {
        Bouquet bouquet = new Bouquet();

        for (int i = 0; i < roseCount; i++) bouquet.add(new RoseFlower());
        for (int i = 0; i < chamomileCount; i++) bouquet.add(new ChamomileFlower());
        for (int i = 0; i < tulipCount; i++) bouquet.add(new TulipFlower());

        wallet += bouquet.getPrice();
        FlowersSaver.save(Main.PATH, bouquet);

        return bouquet;
    }

    public Bouquet sellSequence(int roseCount, int chamomileCount, int tulipCount) {
        Bouquet bouquet = new Bouquet();

        for (int i = 0; i < Math.max(tulipCount, Math.max(roseCount, chamomileCount)); i++) {
            if (i < roseCount) bouquet.add(new RoseFlower());
            if (i < chamomileCount) bouquet.add(new ChamomileFlower());
            if (i < tulipCount) bouquet.add(new TulipFlower());
        }

        wallet += bouquet.getPrice();
        FlowersSaver.save(Main.PATH, bouquet);

        return bouquet;
    }

    @Override
    public void show() {
        System.out.println("Касса: " + wallet);
    }
}