package logic;

public enum Operator {
    PLUS, MINUS, DIVIDE, MULTIPLY,SIN,COS,TAN,FACTORIAL,RADICAL,POWER,POWER2,MOD,ABS,LOG, UNKNOWN;
    public String getSign()
    {
        if(this == PLUS)
            return "+";
        else if(this == MINUS)
            return "-";
        else if(this == DIVIDE)
            return "÷";
        else if(this == MULTIPLY)
            return "×";
        else if(this == POWER)
            return "^";
        else if(this == MOD)
            return "%";
        else if(this == SIN)
            return "sin";
        else if(this == TAN)
            return "tan";
        else if(this == COS)
            return "cos";
        else if(this == LOG)
            return "log";
        else if(this == RADICAL)
            return "√";
        else if(this == FACTORIAL)
            return "fac";
        else if(this == ABS)
            return "abs";
        else
            return "?";
    }
}
