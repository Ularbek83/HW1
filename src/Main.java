import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String peremenyi;
        final int NUM = 19;
        String world = "Geeks";

        peremenyi = "Я иду учиться в "+ NUM +":00 " + world +
                " по адресу ул.Ибраимова 103 БЦ Victory";
        System.out.println(peremenyi);

        if (NUM < 0){
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM>0) {
            System.out.println("Вы сохранили положительное число");
        }else{
            System.out.println("Вы сохранили Ноль");

        }
        System.out.println("--------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите ваше имя:");
        String name = scanner.nextLine();
        scanner = new Scanner(System.in);
        System.out.println(" Введите ваше Фамилию:");
        String surname = scanner.nextLine();
        System.out.println(" Введите ваше Отчество:");
        String surname2 = scanner.nextLine();

        System.out.println("Здравствуйте, "+surname + " " + name + " " + surname2+" !" );
    }
}

/*
Я иду учиться 19:00 Geeks по адресу ул.Ибраимова 103 БЦ Victory
Вы сохранили положительное число
--------------------
 Введите ваше имя:
Уларбек
 Введите ваше Фамилию:
Суюмбеков
 Введите ваше Отчество:
Акпаевич
Здравствуйте Суюмбеков Уларбек Акпаевич !

Process finished with exit code 0

 */