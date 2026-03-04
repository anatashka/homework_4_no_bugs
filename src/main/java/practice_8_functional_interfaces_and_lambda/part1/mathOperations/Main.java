package practice_8_functional_interfaces_and_lambda.part1.mathOperations;

public class Main {
    public static void main(String[] args) {
        MathOperation math = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(math.operation(2, 3));

        MathOperation lambdaDiv = (a, b) -> a / b;
        //try {
            System.out.println(lambdaDiv.operation(4, 0));
      /*  } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        */
        MathOperation lambdaSum = (a, b) -> a + b;
        System.out.println(lambdaSum.operation(4, 5));

        MathOperation lambdaSub = (a, b) -> a - b;
        System.out.println(lambdaSub.operation(4, 5));

        MathOperation lambdaMult = (a, b) -> a * b;
        System.out.println(lambdaMult.operation(4, 5));


    }
}
