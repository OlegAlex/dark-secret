import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int num[] = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            num[i] = input.nextInt();
        }
        System.out.print("Введенные элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + num[i]);
        }
        System.out.println();


        //Поиск максимального значения из массива
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            max = Math.max(max, num[i]);
        }
        System.out.println("Максимальный элемент в массиве num: " + max);


        //Поиск минимального значения массива
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Минимальное значение в массиве num: " + min);

        //Поиск количества повторений числа 5
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (num[i] == 5) {
                j++;
            }
        }
        System.out.println("Количество повторений числа 5: " + j);


        for (int i = num.length - 1; i > 0; i--) {
            for (int n = 0; n < i; n++) {
                if (num[n] > num[n + 1]) {
                    int t = num[n];
                    num[n] = num[n + 1];
                    num[n + 1] = t;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        for(int i = 0; i< num.length; i++){
            System.out.print(num[i]);
        }

    }
}








