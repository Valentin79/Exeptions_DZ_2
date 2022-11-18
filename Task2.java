package DZ_2;

public class Task2 {
    public static void main(String[] args) {
    }
    //  Обернул исходный код в метод, принимающий некий массив. И возвращающий результат деления.
    // Возможно стоит еще добавить проверку на длинну массива? Т.к. в коде указан конкретный индекс.
    public double test(double[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
            return catchedRes1;
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
            return 0;
        }
    }
}

//        Оригинальный код:
//        try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }


