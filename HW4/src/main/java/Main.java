public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = calc.getNumbers();
        int b = calc.getNumbers();
        String sign = calc.getSign();
        System.out.println(Calculator.runCalc(a, b, sign));
    }
}
