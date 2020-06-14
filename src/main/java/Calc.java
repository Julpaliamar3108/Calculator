public class Calc {

    public static double add(double num1, double num2){
        return num1+num2;
    }

    public static int sub(int num1, int num2){
        return num1 - num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static int divide(int num1, int num2){
        if (num2 == 0){
            throw new IllegalArgumentException("На ноль делить нельзя");
        }
        return num1 / num2;
    }
}
