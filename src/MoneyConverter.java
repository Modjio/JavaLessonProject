/* Напишите программу, которая конвертирует сумму денег из
китайских юаней в российские рубли по курсу покупки 10.19. */

/* Часть 3. Добавить цикл проверки правильности ввода количества конвертаций
 и счетный цикл для многократных конвертаций сумм. */

/* Часть 4. Добавить метод, отображающий инструкции, и метод, конвертирующий сумму денег.  */

/* Часть 5. Добавить одномерные массивы сумм денег для многократных конвертаций. */

import java.util.Scanner;

public class MoneyConverter {
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
    public static double[] converter(int[] yuanArray, int n) {
        double[] roublesArray = new double[n];

        // Расчёт по формуле
        for (int i = 0; i < n; i++) {
            roublesArray[i] = ROUBLES_PER_YUAN * yuanArray[i];
        }

        return roublesArray;
    }

    /*
     * метод main
     */
    public static void main(String[] args) {
        int[] yuanArray;    // массив сумм денег в юанях
        double[] roublesArray;   // массив сумм денег в рублях
        int n;              // количество конвертаций

        Scanner input = new Scanner(System.in);

        // вызываем метод отображающий инструкции
        instruction();

        System.out.print("Введите корректное количество конвертаций (0 для выхода): ");
        n = input.nextInt();

        if (n != 0) {
            // Вводные данные
            // Сумма в юанях для конвертации
            System.out.print("Введите " + n + " сумм денег в юанях для конвертации в рубли: ");
            yuanArray = new int[n];
            for (int i = 0; i < n; i++) {
                yuanArray[i] = input.nextInt();
            }

            // вызов метода конвертации
            roublesArray = converter(yuanArray, n);

            // Вывод результата конвертации в рублях в формате таблицы

            System.out.println("\n\tСумма, ¥\tСумма, ₽");
            for (int i = 0; i < n; i++) {
                System.out.println("\t\t" + yuanArray[i] + "\t\t\t" + (int) (roublesArray[i] * 100) / 100.0);
            }
        }
    }
}
