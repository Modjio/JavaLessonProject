/* Напишите программу, которая конвертирует сумму денег из
китайских юаней в российские рубли по курсу покупки 101.98. */
import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {
        double yuan; // сумма денег в китайских юаней
        double rouble; // сумма денег в российских рублях
        final double ROUBLES_PER_YUAN = 10.19; // курс покупки юаня за 1 шт.

        Scanner input = new Scanner(System.in);

        // Вводные данные
        // Сумма в юанях для конвертации
        System.out.print("Введите количество юаней для конвертации в рубли: ");
        yuan = input.nextDouble();

        // Расчёт
        rouble = ROUBLES_PER_YUAN * yuan;

        // Выводимые данные
        // Результат конвертации в рублях
        System.out.println("Результат конвертации: " + (int)(rouble * 100) / 100.0 + " российских рублей.");
    }
}
