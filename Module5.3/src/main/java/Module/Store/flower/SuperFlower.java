package Module.Store.flower;

import Module.Store.GetPrice;
import Module.Store.Show;

public abstract class SuperFlower implements Show, GetPrice {
    private static final int ROSE = 100;        // роза
    private static final int CHAMOMILE = 70;    // ромашка
    private static final int TULIP = 45;        // тульпан

    private int price;

    public SuperFlower() {
        if (this instanceof RoseFlower) this.price = ROSE;
        if (this instanceof ChamomileFlower) this.price = CHAMOMILE;
        if (this instanceof TulipFlower) this.price = TULIP;
    }

    public SuperFlower(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + FlowersSaver.SEPARATOR + price;
    }
}
