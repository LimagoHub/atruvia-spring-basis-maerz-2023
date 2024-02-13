package de.atruvia.application;

import de.atruvia.client.CalcClient;
import de.atruvia.math.Calculator;
import de.atruvia.math.CalculatorImpl;
import de.atruvia.math.CalculatorLogger;
import de.atruvia.math.CalculatorSecure;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();// 1000
        calculator = new CalculatorLogger(calculator);// 2000
        calculator = new CalculatorSecure(calculator);// 3000
        CalcClient client = new CalcClient(calculator);
        client.run();
    }
}