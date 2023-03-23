package de.atruvia.client;

import de.atruvia.math.Calculator;


public class CalcClient {

    private final Calculator calculator;

    public CalcClient(Calculator calculator) {
        this.calculator = calculator;
    }

    public void run() {

        System.out.println(calculator.add(3,4));
    }
}
