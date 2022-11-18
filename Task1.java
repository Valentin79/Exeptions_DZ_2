package DZ_2;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить
// к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(inputNumber());
    }

    public static float inputNumber() {
        System.out.println("Введите дробное число. Пример: 4,5");
        Scanner sc = new Scanner(System.in);
        try {
            float a = sc.nextFloat();
            return a;
        } catch (InputMismatchException e) {
            System.out.println("error" + e + "\nПопробуйте еще раз");
        }
        return inputNumber();
    }
}

