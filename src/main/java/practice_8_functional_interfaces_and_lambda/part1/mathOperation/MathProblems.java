package practice_8_functional_interfaces_and_lambda.part1.mathOperation;

public class MathProblems {
    public static void main(String[] args) {
        MathOperation sum = (a,b) -> a + b;
        System.out.println(sum.operate(5, 5));

        MathOperation sub = (a,b) -> a - b;
        System.out.println(sub.operate(5, 5));

        MathOperation mult = (a,b) -> a * b;
        System.out.println(mult.operate(5, 5));

        try {
            MathOperation div = (a, b) -> a / b;
            System.out.println(div.operate(5, 0));
        } catch (ArithmeticException e){
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}
