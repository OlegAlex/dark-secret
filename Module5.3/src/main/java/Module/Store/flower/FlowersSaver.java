package Module.Store.flower;

import Module.Store.Bouquet;

import java.io.FileWriter;
import java.io.IOException;

public abstract class FlowersSaver {
    public static final String SEPARATOR = ";";

    public static void save(String filePath, Bouquet bouquet) {
        try {
            FileWriter writer = new FileWriter(filePath, true);

            for(SuperFlower flower : bouquet.getFlowers()) {
                writer.write(flower.toString());

                writer.write("\n");
            }

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}