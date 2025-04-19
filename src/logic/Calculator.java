package logic;

public class Calculator {

    /**
     * @param operand1 left-handed-side operand.
     * @param operand2 right-handed-side operand.
     * @param operator operator to apply on operands.
     * @return result of the calculation
     */
    public static double calculate(StringBuilder operand1, StringBuilder operand2, StringBuilder operator) {
        switch (Operator.valueOf(operator.toString())) {
            case PLUS:
                return Double.parseDouble(operand1.toString()) + Double.parseDouble(operand2.toString());
            case MINUS:
                return Double.parseDouble(operand1.toString()) - Double.parseDouble(operand2.toString());
            case DIVIDE:
                return Double.parseDouble(operand1.toString()) / Double.parseDouble(operand2.toString());
            case MULTIPLY:
                return Double.parseDouble(operand1.toString()) * Double.parseDouble(operand2.toString());
            case POWER:
                return Math.pow(Double.parseDouble(operand1.toString()), Double.parseDouble(operand2.toString()));
            case MOD:
                return Double.parseDouble(operand1.toString())% Double.parseDouble(operand2.toString());
            case SIN:
                return Math.sin(Double.parseDouble(operand1.toString()));
            case COS:
                return Math.cos(Double.parseDouble(operand1.toString()));
            case TAN:
                return Math.tan(Double.parseDouble(operand1.toString()));
            case LOG:
                return Math.log10(Double.parseDouble(operand1.toString()));
            case ABS:
                return Math.abs(Double.parseDouble(operand1.toString()));
            case RADICAL:
                return Math.sqrt(Double.parseDouble(operand1.toString())); 
            case FACTORIAL:{
                int x = (int)Double.parseDouble(operand1.toString());
                int ans = 1;
                for (int i = 1; i <= x; i++) { ans *=i; }
                return ans;
            }
            case UNKNOWN:
            default:
                return 0;
        }
    }
}
