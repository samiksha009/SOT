public class MathEquation {
    double leftVal;
    double rightVal;
    char opCode;
    double result;

    private static int numberOfCalculations;
    private static double sumOfResults;
    public MathEquation() {}

    public MathEquation(char opCode){
        this.opCode = opCode;
    }

    public MathEquation(double leftVal, double rightVal, char opCode ){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }
    void execute() {
        switch (opCode){
            case 'a' :
                result = leftVal + rightVal;
                break;
            case 's' :
                result = leftVal - rightVal;
                break;
            case 'd' :
                result = rightVal!=0 ? ( leftVal / rightVal) : 0.0d;
                break;
            case 'm' :
                result = leftVal * rightVal;
                break;
            default :
                System.out.println("Invalid opCode " + opCode);
                result = 0.0d;
                break;
        }
        numberOfCalculations++;
        sumOfResults += result;
    }

    public void execute(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal=rightVal;
         execute();
    }
    public void execute(int leftVal, int rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        execute();
        result = (int) result;
    }
    public static double getAvgResult(){
        return sumOfResults/numberOfCalculations;
    }

    public double getResult(){
        return this.result;
    }
}
