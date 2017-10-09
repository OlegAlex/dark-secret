package Transport;

import java.util.Scanner;

public class CarWheel {
   private float wheelintegrity;


    public CarWheel() {
        wheelintegrity = 1;
    }


    void changewheel() {
        if (wheelintegrity == 0) {
            wheelintegrity = 1;
        }
    }


    void erasewheel() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите процент, на который Вы хотите стереть шину");
        int x = input.nextInt();
        float o = x / 100;
        this.wheelintegrity = wheelintegrity - o;
    }


    float stwheel(){
        return wheelintegrity;
    }


    void Sysout() {
        System.out.println("Состояние шины: " + wheelintegrity);
    }
}
