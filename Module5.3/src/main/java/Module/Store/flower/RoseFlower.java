package Module.Store.flower;

public class RoseFlower extends SuperFlower {
    public static final int FLOWER_PRICE = 100;

    public RoseFlower() {
        super();
    }

    public RoseFlower(int price) {
        super(price);
    }

    @Override
    public void show() {
        System.out.print("роза");
    }
}
