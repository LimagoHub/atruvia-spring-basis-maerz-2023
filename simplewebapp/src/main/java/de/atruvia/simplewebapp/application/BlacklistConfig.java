package de.atruvia.simplewebapp.application;

import de.atruvia.simplewebapp.service.BlacklistService;
import de.atruvia.simplewebapp.service.BlacklistServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BlacklistConfig {

    /*
        Gruende fuer diese Loesung

        1.) Weil keine Technik in den Klassen gewuenscht ist (z.B. Fachliche Layer)
        2.) Erzeugen der Instanz zu komplex fuer Spring
        3.) Wenn kein Zugriff auf den Quellcode moeglich ist
     */

    @Bean
    public BlacklistService createBlacklistSerice(@Qualifier("antipathen") List<String> leute) {
        return new BlacklistServiceImpl(leute);
    }

    @Bean
    @Qualifier("antipathen")
    public List<String> schlechteLeute() {
        return  List.of("Peter","Paul","Mary");
    }
    @Bean
    @Qualifier("fruits")
    public List<String> fruits() {
        return  List.of("apple","banana","cherry");
    }
}
