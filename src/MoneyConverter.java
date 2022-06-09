/* Напишите программу, которая конвертирует сумму денег из
китайских юаней в российские рубли по курсу покупки 10.19. */
import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {
        int yuan; // сумма денег в китайских юаней
        double rouble; // сумма денег в российских рублях
        final double ROUBLES_PER_YUAN = 10.19; // курс покупки юаня за 1 шт.
        //int ending;

        Scanner input = new Scanner(System.in);

        // Вводные данные
        // Сумма в юанях для конвертации
        System.out.print("Введите количество юаней для конвертации в рубли: ");
        yuan = input.nextInt();

        // Расчёт по формуле
        rouble = ROUBLES_PER_YUAN * yuan;

        // Определение правильного окончания валюты
        System.out.print(yuan);

        if (yuan == 1)
            System.out.print(" китайский юань равен ");
        else if (2 <= yuan && yuan <= 4)
                System.out.print(" китайских юаня равны ");
             else
                System.out.print(" китайских юаней равны ");

        // Выводимые данные
        // Результат конвертации в рублях
        System.out.println((int)(rouble * 100) / 100.0 + " российских рублей.");
    }
}
