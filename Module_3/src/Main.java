import java.util.Scanner;


public class Main {



     /*bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }*/
    public static void main( String [] args) {
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
        for(int i=0; i<size; i++) {
            if (num[i]== 5){
                j++;
            }
        }
        System.out.println("Количество повторений числа 5: " + j);



    }
}








