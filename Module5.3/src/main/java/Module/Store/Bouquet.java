package Module.Store;

import Module.Store.flower.SuperFlower;

import java.util.ArrayList;

public class Bouquet implements Show, GetPrice {
    private ArrayList<SuperFlower> flowers;

    public Bouquet() {
        flowers = new ArrayList<>();
    }

    @Override
    public void show() {
        int i = 0;

        System.out.print("Букет: ");
        for (; i < flowers.size() - 1; i++) {
            flowers.get(i).show();
            System.out.print(", ");
        }

        flowers.get(i).show();
        System.out.println();
    }

    public void add(SuperFlower flower) {
        flowers.add(flower);
    }

    @Override
    public int getPrice() {
        int result = 0;

        for (SuperFlower flower : flowers) {
            result += flower.getPrice();
        }

        return result;
    }

    public ArrayList<SuperFlower> getFlowers() {
        return flowers;
    }
}