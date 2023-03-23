package de.application.translators;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("upper")
public class ToUpperTranslator implements Translator{
    @Override
    public String translate(String textToTranslate) {
        return textToTranslate.toUpperCase();
    }
}
