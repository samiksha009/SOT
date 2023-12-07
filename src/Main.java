import java.util.*;

public class Main {

    public static void main(String[] args){

        Divider divider = new Divider();
        doCalculation(divider, 100.0d, 50.0d);

        Adder adder = new Adder();
        doCalculation(adder, 25.0d, 92.0d);

        performMoreCalculations();
        dynamicInteractively();

    }

    private static void dynamicInteractively() {
        DynamicHelper helper;
        helper = new DynamicHelper(new MathProcessing[] {
            new Adder(), new PowerOf()
        });

        System.out.println("Enter an operation and two numbers: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        helper.process(userInput);
    }



    private static void executeInteractively(){
        System.out.println("Enter an operation and two numbers: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);

    }
    private static void performOperation(String[] parts) {
        MathOperations operation = MathOperations.valueOf(parts[0].toUpperCase());
        double leftVal = Double.parseDouble(parts[1]);
        double rightVal = Double.parseDouble(parts[2]);
        CalculateBase calculation = createcalculation(operation, leftVal, rightVal);
        calculation.calculate();

        System.out.println("Operation performed : " + operation);
        System.out.println(calculation.getResult());
    }

    private static CalculateBase createcalculation(MathOperations operation , double leftVal, double rightVal){
        CalculateBase calculation = null;
        switch (operation){
            case ADD:
                calculation = new Adder(leftVal, rightVal);
                break;
            case SUBTRACT:
                calculation = new Subtractor(leftVal, rightVal);
                break;
            case MULTIPLY:
                calculation = new Multiplier(leftVal, rightVal);
                break;
            case DIVIDE:
                calculation = new Divider(leftVal, rightVal);
                break;

        }
        return calculation;
    }
    private static void performMoreCalculations() {
        CalculateBase[] calculations = {
                new Divider(100.0d, 50.0d),
                new Adder(100.0d, 50.0d),
                new Multiplier(100.0d, 50.0d),
                new Subtractor(100.0d, 50.0d)
        };

        System.out.println();
        System.out.println("Array Calculation");

        for(CalculateBase calculation : calculations){
            calculation.calculate();
            System.out.println("result =" + calculation.getResult());
        }
    }

    static void doCalculation(CalculateBase calculation, double leftVal, double rightVal){
        calculation.setLeftVal(leftVal);
        calculation.setRightVal(rightVal);
        calculation.calculate();
        System.out.println("Calculation result = " + calculation.getResult());
    }
}
