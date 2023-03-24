package de.atruvia.first;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(10)
public class OtherRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Welt");
    }
}
