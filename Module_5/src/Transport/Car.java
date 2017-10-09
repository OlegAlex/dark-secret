package Transport;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    private final String dateofrel;
    private String typeofeng;
    private int maxspd;
    private float acceler;
    private byte maxpasseng;
    private byte currentpasseng;
    private int currentspd;
    CarWheel wheel1 = new CarWheel();
    CarWheel wheel2 = new CarWheel();
    CarWheel wheel3 = new CarWheel();
    CarWheel wheel4 = new CarWheel();
    CarDoor door1 = new CarDoor();
    CarDoor door2 = new CarDoor();
    CarDoor door3 = new CarDoor();
    CarDoor door4 = new CarDoor();
    Object[] arraywheels = {wheel1, wheel2, wheel3, wheel4};
    Object[] arraydoors = {door1, door2, door3, door4};


    public Car(String dateofrel,
               String typeofeng,
               int maxspd,
               float acceler,
               byte maxpasseng,
               byte currentpasseng,
               int currentspd) {

        this.dateofrel = dateofrel;
        this.typeofeng = typeofeng;
        this.maxspd = maxspd;
        this.acceler = acceler;
        this.maxpasseng = maxpasseng;
        this.currentpasseng = currentpasseng;
        this.currentspd = currentspd;
    }


    void changespd() {
        Scanner input = new Scanner(System.in);
        System.out.println("Вы хотите увеличить скорость или уменьшить?" + "/n" +
                "Нажмите <1> для увеличения или <0> для умеьшения");
        byte g = input.nextByte();
        if (g == 1) {
            System.out.println("На сколько вы хотите увеличить скорость?");
            int h = input.nextByte();
            currentspd = currentspd + h;
        } else {
            System.out.println("На сколько вы хотите уменьшить скорость?");
            int k = input.nextByte();
            currentspd = currentspd - k;
        }
    }


    void addpassenger() {
        currentpasseng++;
    }


    void dropoffpassanger() {
        currentpasseng--;
    }


    void getdoor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите индекс двери");
        byte i = input.nextByte();
        if (i == 1) {
            System.out.println(Arrays.asList(arraydoors).indexOf(door1));
        } else if (i == 2) {
            System.out.println(Arrays.asList(arraydoors).indexOf(door2));
        } else if (i == 3) {
            System.out.println(Arrays.asList(arraydoors).indexOf(door3));
        } else {
            System.out.println(Arrays.asList(arraydoors).indexOf(door4));
        }
    }


    void getwheel() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите индекс шины");
        byte i = input.nextByte();
        if (i == 1) {
            System.out.println(Arrays.asList(arraydoors).indexOf(wheel1));
        } else if (i == 2) {
            System.out.println(Arrays.asList(arraydoors).indexOf(wheel2));
        } else if (i == 3) {
            System.out.println(Arrays.asList(arraydoors).indexOf(wheel3));
        } else {
            System.out.println(Arrays.asList(arraydoors).indexOf(wheel4));
        }
    }


    void removeallwheels() {
        arraywheels = null;
    }


    void possiblemaxspd() {
        wheel1.erasewheel();
        wheel2.erasewheel();
        wheel3.erasewheel();
        wheel4.erasewheel();
        float integ1 = wheel1.stwheel();
        float integ2 = wheel2.stwheel();
        float integ3 = wheel3.stwheel();
        float integ4 = wheel4.stwheel();
        float mininteg = 0;
        float u;
        int posmaxspeed;
        if (integ1 < integ2 && integ1 < integ3 && integ1 < integ4) {
            mininteg = integ1;
        } else if (integ2 < integ1 && integ2 < integ3 && integ2 < integ4) {
            mininteg = integ2;
        } else if (integ3 < integ1 && integ3 < integ2 && integ3 < integ4) {
            mininteg = integ3;
        } else if (integ4 < integ1 && integ4 < integ2 && integ4 < integ3) {
            mininteg = integ4;
        }
        if (currentpasseng == 0) {
            posmaxspeed = 0;
        } else {
            u = maxspd * mininteg;
            posmaxspeed = (int) (float) u;
        }
        System.out.println("Максимальная скорость в зависимости от износа шин" + posmaxspeed);

    }


    void Sysout() {
        System.out.println("Дата выпуска машины: " + dateofrel);
        System.out.println("Тип двигателя: " + typeofeng);
        System.out.println("Максимальная скорость: " + maxspd);
        System.out.println("Время разгона до 100 км/час:" + acceler);
        System.out.println("Пассажировместимость: " + maxpasseng);
        System.out.println("Количество пассажиров в машине в данный момент:" + currentpasseng);
        System.out.println("Скорость в данный момент: " + currentspd);
        possiblemaxspd();
    }
}
