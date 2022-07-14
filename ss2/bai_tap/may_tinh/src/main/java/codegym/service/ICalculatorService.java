package codegym.service;

import org.springframework.stereotype.Service;


public interface ICalculatorService {

    String calculator(double number1, double number2, String operand);
}
