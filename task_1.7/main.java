/* Задача наполнить корабельный бассейн. Нужно посчитать, сколько литров воды нужно для заполнения бассейна до бортов.
Известно, что бассейн имеет линейные размеры a × b × c, заданные в метрах.
Эти размеры передаются запрашиваются у пользователя. Прграмма должена вывести на экран количество литров воды,
которое нужно для наполнения бассейна.
Пример:
Пользователь даёт числа 25, 5, 2.
Пример вывода:
250000 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a,b,c;
        System.out.print("Введите знаение A: ");
        a = scanner.nextInt();
        System.out.print("Введите значение B: ");
        b = scanner.nextInt();
        System.out.print("Введите значение C: ");
        c = scanner.nextInt();
        System.out.print("Объем бассейна равен: "+(a*b*c));
        System.out.print(" литров");

    }
}
