package Controller;

import java.io.IOException;
import java.util.ArrayList;

import Alert.Alert;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import java.text.DecimalFormat;
import logic.Calculator;
import logic.Operator;

public class Control{

    static public StringProperty display = new SimpleStringProperty("");
    static public ArrayList<String> CalculationHistory = new ArrayList<>();
    static public ArrayList<Double> AnswerHistory = new ArrayList<>();
    static String num1 = "";
    static String num2 = "";
    static Operator operator = null;

    static public void setSpacialNumber(double num)
    {
        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(3);
        if(operator == null)
        {
            num1 = df.format(num);       
            display.set(num1);     
        }
        else
        {
            num2 = df.format(num); 
            display.set(num1 + operator.getSign() + num2);
        }                   
    }
    static public void addNumber(String num)
    {
        if(operator == null)
        {
            if(!(num1.length() == 0 && num.equals("0")))
            {
                num1 += num;
                display.set(num1);
            }
            
        }
        else
        {
            if(!(num2.length() == 0 && num.equals("0")))
            {
                num2 += num;
                display.set(num1 + operator.getSign() + num2);
            }
            
        }
        
    }
    static public void setOperator(Operator op)
    {
        if(num1.length() == 0)
        {
            Alert.display("Error", "Insert a number");
        }
        else
        {
            operator = op;
            display.set(num1 + operator.getSign() + num2);
        }
    }
    static public void oneOperator(Operator op) throws IOException
    {
        if(num1.length() == 0)
        {
            Alert.display("Error", "Insert a number");
        }
        else if(num2.length()!=0)
        {
            Alert.display("Error", "Operation not supported");
        }
        else
        {
            CalculationHistory.add(op.getSign()+"("+num1+")");
            StringBuilder n1 = new StringBuilder(num1);
            StringBuilder o = new StringBuilder(op.toString());

            DecimalFormat df = new DecimalFormat("#");
            df.setMaximumFractionDigits(3);
            num1 = df.format(Calculator.calculate(n1, null, o));

            AnswerHistory.add(Double.parseDouble(num1));
            operator = null;
            num2 = "";
            display.set(num1);
            History.his.update();
        }
    }
    static public void setEqual() throws IOException
    {
        if(num1.length() == 0 || num2.length() == 0)
        {
            Alert.display("Error", "Inser number");
        }
        else
        {
            CalculationHistory.add(num1+operator.getSign()+num2);
            StringBuilder n1 = new StringBuilder(num1);
            StringBuilder n2 = new StringBuilder(num2);
            StringBuilder o = new StringBuilder(operator.toString());

            DecimalFormat df = new DecimalFormat("#");
            df.setMaximumFractionDigits(3);
            num1 = df.format(Calculator.calculate(n1, n2, o));
            
            AnswerHistory.add(Double.parseDouble(num1));
            operator = null;
            num2 = "";
            display.set(num1);
            History.his.update();
        }
    }
    static public void clear(boolean full){
        if(full)
        {
            num1 = "";
            num2 = "";
            operator = null;
            display.set("");
        }
        else
        {
            if(num2.length() == 0)
            {
                num1 = "";
                num2 = "";
                operator = null;
                display.set("");
            }
            else
            {
                num2 = "";
                operator = null;
                display.set(num1);
            }
        }        
    }
}