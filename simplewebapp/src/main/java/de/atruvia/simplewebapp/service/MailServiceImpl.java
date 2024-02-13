package de.atruvia.simplewebapp.service;

public class MailServiceImpl {
    public MailServiceImpl(
            String username,
            String kennwort,
            String imapserver,
            String pop3server,
            String smpt,
            String postfach
    ) {
        System.out.println(username);
        System.out.println("MailService created");
    }
}
