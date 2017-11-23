package Module.Store.flower;


public class ChamomileFlower extends SuperFlower {
    public ChamomileFlower() {
        super();
    }

    public ChamomileFlower(int price) {
        super(price);
    }

    @Override
    public void show() {
        System.out.print("ромашка");
    }
}
