package Transport;

public class CarDoor {
    //По стандарту doorstate = true - дверь закрыта
    //По стандарту windowstate = true - окно закрыто
    private boolean doorstate;
    private boolean windowstate;


    public CarDoor() {
        this.doorstate = doorstate;
        this.windowstate = windowstate;
    }


    void opendoor() {
        doorstate = false;
    }


    void closedoor() {
        doorstate = true;
    }


    void doorcond() {
        if (!doorstate) {
            doorstate = true;
        } else if (doorstate) {
            doorstate = false;
        }
    }


    void openwindow() {
        windowstate = false;
    }


    void closewindow() {
        windowstate = true;
    }


    void windowcond() {
        if (!windowstate) {
            windowstate = true;
        } else if (windowstate) {
            windowstate = false;
        }
    }


    void Sysout() {
        if (doorstate && windowstate) {
            System.out.println("Дверь закрыта" + "/n" + "Окно закрыто");
        } else if (!doorstate && windowstate) {
            System.out.println("Дверь открыта" + "/n" + "Окно закрыто");
        } else if (doorstate && !windowstate) {
            System.out.println("Дверь закрыта" + "/n" + "Окно закрыто");
        } else if (!doorstate && !windowstate) {
            System.out.println("Дверь открыта" + "/n" + "Окно открыто");
        }
    }
}

