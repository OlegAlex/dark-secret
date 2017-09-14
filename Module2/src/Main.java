import java.util.Scanner;

public class Main {
    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        String name = in.nextLine();
        System.out.print("Введите Ваш город проживания: ");
        String city = in.nextLine();
        System.out.print("Введите название Вашего хобби: ");
        String hobby = in.nextLine();
        System.out.print("Введите Ваш возраст: " + "\n" + "\n" );
        int age = in.nextInt();


        System.out.print( "Ваше имя: " + name + "\n" + "Ваш город проживания: " + city + "\n" + "Ваш возраст: " + age + "\n" + "Ваше хобби: " + hobby + "\n" + "\n");

        System.out.print( "Человек по имени " + name + " живет в городе " + city + "." + " Этому человеку " + age + " лет и он любит заниматься " + hobby + "." + "\n" + "\n");

        System.out.print( name + " -- Имя" + "\n" + city + " -- Город" + "\n" + hobby + " -- Хобби" + "\n" + age + " -- Возраст"+ "\n" );


    }
}
