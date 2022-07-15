package codegym.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {

    @Override
    public String calculator(double number1, double number2, String operand) {
        switch (operand){
            case "+" :
                return number1 + " " + operand + " " +  number2 + "=" + (number1 + number2);
            case "-":
                return number1 + " " + operand + " " + number2 + "=" +(number1 - number2);
            case "*":
                return number1 + " " + operand + " " + number2 + "=" + (number1 * number2);
            case "/":
                if (number2 == 0) {
                    throw new RuntimeException("number 2 > 0");
                } else {
                    return number1 + " " + operand + " " + number2 + "=" +   (number1 / number2);
                }
            default:
              throw new RuntimeException("Unable to perform calculation");
        }
    }
}
