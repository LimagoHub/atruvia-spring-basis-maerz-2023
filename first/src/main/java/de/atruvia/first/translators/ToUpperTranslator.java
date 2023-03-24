package de.atruvia.first.translators;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Qualifier("upper")
//@Profile("production")
public class ToUpperTranslator implements Translator{
    @Override
    public String translate(String textToTranslate) {
        return textToTranslate.toUpperCase();
    }
}
