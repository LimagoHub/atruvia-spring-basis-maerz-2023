package de.application.demo;



import de.application.translators.Translator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
//@Scope("prototype")
//@Lazy
public class AnnotationDemo {


    private final Translator translator;

    //@Autowired
    public AnnotationDemo(@Qualifier("upper") final Translator translator) {
        this.translator = translator;
        System.out.println(translator.translate("Geht"));
    }

    @PostConstruct
    public void init() {
        System.out.println(translator.translate("Init"));
    }
}
