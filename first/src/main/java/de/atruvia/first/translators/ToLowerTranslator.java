package de.atruvia.first.translators;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Qualifier("lower")
public class ToLowerTranslator implements Translator{
    @Override
    public String translate(String textToTranslate) {
        return textToTranslate.toLowerCase();
    }
}
