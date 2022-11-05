public class MainClass {
    public static void main(String[] args) {

        double resAdd = Calculator.add(3,4);
        System.out.println("Addition " +resAdd);

        double resSubtract = Calculator.subtract(3,4);
        System.out.println("Subtraction " +resSubtract);

        double resMultiply = Calculator.multiply(3,4);
        System.out.println("Multiplication " +resMultiply);

        double resDivision = Calculator.divide(3,4);
        System.out.println("Division " +resDivision);
    }
}
