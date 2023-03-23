package de.application.demo;

import de.application.translators.Translator;

public class Demo {

    private String message = "Hallo Welt!"; // Content
    private  final Translator translator;



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    public Demo(final Translator toUpper) {
        this.translator = toUpper;
        System.out.println("Hier ist der Construktor von Demo");
        System.out.println(message);
        System.out.println("Construktor Ende");
    }

    public void foo() {
        System.out.println(translator.translate("Hier ist foo von Demo"));

    }

    private void init( ) {// Construktor 2.0
        System.out.println("Hier ist bar von Demo");
        // Db connecten
        System.out.println(translator.translate(message));
        System.out.println("Ende bar");
    }

    public void close() {
        // Db Verbindung abbauen
        System.out.println("Und Tschuess!");
    }
}
