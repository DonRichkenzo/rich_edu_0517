/*
Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.
Пример:
Метод sumDigitsInNumber вызывается с параметром 546.
Пример вывода:
15
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }
    static int result = 0;
    public static int sumDigitsInNumber(int number) {
        while(number > 0){
            result = result + number % 10 ;
            number = number / 10 ;
        }
        return result;
    }
}
