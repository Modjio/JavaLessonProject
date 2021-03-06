/* Напишите программу, которая конвертирует сумму денег из
китайских юаней в российские рубли по курсу покупки 10.19. */

/* Часть 3. Добавить цикл проверки правильности ввода количества конвертаций
 и счетный цикл для многократных конвертаций сумм. */

/* Часть 4. Добавить метод, отображающий инструкции, и метод, конвертирующий сумму денег.  */

import java.util.Scanner;

public class MoneyConverter {
    static double rouble; // сумма денег в российских рублях
    static final double ROUBLES_PER_YUAN = 10.19; // курс покупки юаня за 1 шт.

    /*
    * метод отображающий инструкции
     */
    public static void instruction() {
        System.out.println("Аннотация:");
        System.out.println("Программа позволять произвести конвертацию китайских юаней в рубли по курсу " + ROUBLES_PER_YUAN + " рублей за юань.");
        System.out.println();
    }

    /*
    * метод конвертирующий сумму денег
     */
    public static double converter(int yuan) {
        // Расчёт по формуле
        rouble = ROUBLES_PER_YUAN * yuan;

        // Выводим данные если значение положительное
        if (yuan > 0) {
            System.out.print(yuan);

            // Определение правильного окончания валюты
            if (yuan == 1)
                System.out.print(" китайский юань равен ");
            else if (yuan <= 4)
                System.out.print(" китайских юаня равны ");
            else
                System.out.print(" китайских юаней равны ");
        }
        return rouble;
    }

    /*
    * метод main
     */
    public static void main(String[] args) {
        int yuan; // сумма денег в китайских юаней

        Scanner input = new Scanner(System.in);

        // вызываем метод отображающий инструкции
        instruction();

        yuan = 1; // инициализируем значение для начала цикла
        while (yuan != 0) { // счётный цикл для многократных конвертаций

            // проверка правильности ввода
            do {
                // Вводные данные
                // Сумма в юанях для конвертации
                System.out.print("Введите количество юаней для конвертации в рубли (0 для выхода): ");
                yuan = input.nextInt();
            } while (yuan < 0);

            // вызов метода конвертации
            rouble = converter(yuan);

            // Вывод результата конвертации в рублях
            if (rouble != 0) //
                System.out.println((int) (rouble * 100) / 100.0 + " российских рублей.\n");
        }
    }
}
