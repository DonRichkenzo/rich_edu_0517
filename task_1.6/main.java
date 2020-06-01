/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a;
        float num1 = 100;
        float num2 = 15;
        System.out.print("Введите число A: ");
        a = scanner.nextInt();
        System.out.println("Значение А + 15%: "+((a/num1) * num2 + a));

    }
}
