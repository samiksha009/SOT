// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CalcEngine {
    public static void main(String[] args) {
        performCalculations();
    }

    static void performCalculations() {
//        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
//        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
//        char[] opCodes = {'d', 'a', 's', 'm'};
//        double[] results = new double[opCodes.length];


        MathEquation[] equations = new MathEquation[4];
//        equations[0] = new MathEquation();
//        equations[0].leftVal = 100.0d;
//        equations[0].rightVal = 50.0d;
//        equations[0].opCode = 'd';

        equations[0] = new MathEquation(100.0d, 50.0d, 'd');
        equations[1] = new MathEquation(25.0d, 92.0d, 'a');
        equations[2] = new MathEquation(225.0d, 17.0d, 's');
        equations[3] = new MathEquation(11.0d, 3.0d, 'm');

//        for(int i=0; i<opCodes.length; i++){
//            results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
//        }
//
//        for(double currentResult : results)
//            System.out.println("result = " + currentResult);
//    }
        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("result = " + equation.result);
        }

        System.out.println("Averaged result = "+ MathEquation.getAvgResult());

        System.out.println();
        System.out.println("using execute overloads");
        System.out.println();

        MathEquation equationOverload = new MathEquation('d');
        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        equationOverload.execute(leftDouble,rightDouble);
        System.out.println("Overloaded result with doubles: " + equationOverload.getResult());

        int leftInt=9;
        int rightInt=4;
        equationOverload.execute(leftInt,rightInt);
        System.out.println("Overloaded result with integers: " + equationOverload.getResult());

    }



//    static double execute(char opCode, double leftVal, double rightVal){
//        double result;
//        switch (opCode){
//            case 'a' :
//                result = leftVal + rightVal;
//                break;
//            case 's' :
//                result = leftVal - rightVal;
//                break;
//            case 'd' :
//                result = rightVal!=0 ? ( leftVal / rightVal) : 0.0d;
//                break;
//            case 'm' :
//                result = leftVal * rightVal;
//                break;
//            default :
//                System.out.println("Invalid opCode " + opCode);
//                result = 0.0d;
//                break;
//        }
//        return result;
//    }
//        private static MathEquation create(double leftVal, double rightVal, char opCode) {
//            MathEquation equation;
//            equation = new MathEquation();
//            equation.leftVal = leftVal;
//            equation.rightVal = rightVal;
//            equation.opCode = opCode;
//            return equation;
//        }
}