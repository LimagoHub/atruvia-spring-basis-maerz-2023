package de.atruvia.first;

import de.atruvia.first.translators.Translator;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(500)
@RequiredArgsConstructor
public class MyCommandlineRunner implements CommandLineRunner {

    @Qualifier("lower") @NonNull
    private final Translator translator ;



    @Override
    public void run(String... args) throws Exception {
        System.out.println(translator.translate("Hallo"));
    }
}
