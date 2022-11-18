package DZ_2;

import java.util.Scanner;

public class Task4 {
    //Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    //Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void main(String[] args) {
        try {
            System.out.println(inputString());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    // Пробелы считаются за пустую строку?
    public static String inputString() throws Exception {
        System.out.println("Напишите что-нибудь");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str == ""){
            throw new Exception("Пустую строку вводить нельзя");
        }
        return str;
    }

}
