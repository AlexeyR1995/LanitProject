import java.util.Scanner;

public class Calculator {
    Scanner input;
    int a = 0;
    String sign = "";


    public int getNumbers() {
        System.out.println("введите число");
        try {
            a = Integer.parseInt(input.nextLine());
        } catch (Exception e) {
            System.out.println("неправильный ввод: " + e.getMessage());
            System.out.print("повторите ввод: ");
            getNumbers();
        }
        return a;
    }

    public String getSign() {
        System.out.println("введите арифметическую операцию");
        sign = input.nextLine();
        if (!sign.matches("^[-+/*]$")) {
            System.out.println("неверная операция");
            sign = getSign();
        }
        return sign;
    }

    public static int runCalc(int a, int b, String sign) {
        int result = switch (sign) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
        return result;
    }


}
