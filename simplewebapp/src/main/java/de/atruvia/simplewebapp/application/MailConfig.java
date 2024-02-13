package de.atruvia.simplewebapp.application;

import de.atruvia.simplewebapp.YamlPropertySourceFactory;
import de.atruvia.simplewebapp.service.MailServiceImpl;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:mail.yml", factory = YamlPropertySourceFactory.class)
@ConfigurationProperties(prefix = "mail")
@Setter
public class MailConfig {
    private String username;
    private String kennwort;
    private String imapserver;
    private String pop3server;
    private String smpt;
    private String postfach;

    @Bean
    public MailServiceImpl createMailService() {
        return new MailServiceImpl(username,kennwort,imapserver,pop3server,smpt,postfach);
    }
}
