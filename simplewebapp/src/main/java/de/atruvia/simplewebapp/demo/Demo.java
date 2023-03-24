package de.atruvia.simplewebapp.demo;


import de.atruvia.simplewebapp.repository.SchweinRepository;
import de.atruvia.simplewebapp.repository.entity.SchweinEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.UUID;

@Component
@Transactional
public class Demo {

    private final SchweinRepository repo;

    private String message = "Hallo Welt"; // 2. FieldInjection
    public Demo(@Value("${Demo.gruss}") String message, SchweinRepository repo) {  // 1. Construktor
        this.repo = repo;
        this.message = message;
        System.out.println("Ctor Demo");
        System.out.println(message);
    }

    @PostConstruct
    public void init() { // 3. PostConstruct
        System.out.println(message);

        SchweinEntity piggy = SchweinEntity.builder().id(UUID.randomUUID()).name("Miss Piggy").gewicht(10).build();
        repo.save(piggy);


    }
}
