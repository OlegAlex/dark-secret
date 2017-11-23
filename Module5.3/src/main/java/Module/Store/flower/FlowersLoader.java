package Module.Store.flower;

import Module.Store.Bouquet;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public abstract class FlowersLoader {
    public static Bouquet load(String filePath) {
        try {
            Bouquet bouquet = new Bouquet();

            FileReader reader = new FileReader(filePath);
            Scanner scanner = new Scanner(reader);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(FlowersSaver.SEPARATOR);

                String className = data[0];
                int flowerPrice = Integer.parseInt(data[1]);

                if (className.equals(RoseFlower.class.getSimpleName())) bouquet.add(new RoseFlower(flowerPrice));
                if (className.equals(ChamomileFlower.class.getSimpleName())) bouquet.add(new ChamomileFlower(flowerPrice));
                if (className.equals(TulipFlower.class.getSimpleName())) bouquet.add(new TulipFlower(flowerPrice));
            }

            reader.close();
            return bouquet;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}