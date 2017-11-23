package Module.Store.flower;

public class TulipFlower extends SuperFlower {
    public TulipFlower() {
        super();
    }

    public TulipFlower(int price) {
        super(price);
    }


    @Override
    public void show() {
        System.out.print("тюльпан");
    }
}
