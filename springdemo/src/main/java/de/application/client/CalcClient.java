package de.application.client;


import de.application.math.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CalcClient {

    private final Calculator calculator;

    @Autowired
    public CalcClient(@Qualifier("secure") final Calculator calculator) {
        this.calculator = calculator;
    }

    @PostConstruct
    public void run() {

        System.out.println(calculator.add(3,4));
    }
}
