import java.util.Scanner;

public class Mod4 {
    public static void count() {
        int i = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = input.nextInt();
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        System.out.println();
    }

    public static void drawRectangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длинну прямоугольника: ");
        int z = input.nextInt();
        System.out.println("Введите ширину прямоугольника: ");
        int j = input.nextInt();
        String rectangle[][] = new String[z][j];
        String gn;
        for (int a = 0; a < z; a++)
            for (int b = 0; b < j; b++) {
                gn = "+";
                rectangle[z - 1][j - 1] = gn;
            }
        for (int a = 0; a < z; a++) {
            for (int b = 0; b < j; b++) {
                System.out.print(rectangle[z - 1][j - 1] + " ");

            }
            System.out.println();
        }
    }

    public static void drawRectangle(int v) {
        String mas[][] = new String[v][v];
        String sn;
        for (int a = 0; a < v; a++)
            for (int b = 0; b < v; b++) {
                sn = "+";
                mas[v - 1][v - 1] = sn;
            }
        for (int a = 0; a < v; a++) {
            for (int b = 0; b < v; b++) {
                System.out.print(mas[v - 1][v - 1] + " ");

            }
            System.out.println();
        }

    }

    public static void getMax() {
        int max;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int q = input.nextInt();
        System.out.println("Введите число: ");
        int w = input.nextInt();
        if (q > w) {
            max = q;
        } else {
            max = w;
        }
        System.out.println("Максимальное число1: " + max);
    }

    public static void getMax(int m, int n) {
        int max;
        if (m > n) {
            max = m;
        } else {
            max = n;
        }
        System.out.println("Максимальное число 2: " + max);

    }

    public static void getMax(float g, float h) {
        float max;
        if (g > h) {
            max = g;
        } else {
            max = h;
        }
        System.out.println("Максимальное число 3: " + max);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Какую операцию вы хотите выполнить?");
        System.out.println("Введите 1, 2, 3 или 4");
        int p = input.nextInt();
        switch (p) {
            case 1:
                count();
                break;
            case 2:
                drawRectangle();
                break;
                case 3:
                    drawRectangle(6);
                    System.out.println("Хотите ли вы выполнить еще одну операцию?");
                    System.out.println("Введите 1 для <да> или 0 для <нет>");
                    int ok = input.nextInt();
                    if (ok == 1) {
                        i = 1;
                        break;
                    } else {
                        i = 0;
                break;
            case 4:
                getMax();
                System.out.println();
                getMax(3, 4);
                System.out.println();
                getMax(3.14f, 3.16f);
                break;

        }

    }
        }while(i == 1);
    }


}
