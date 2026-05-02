package com.example.Note.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing    // for automatically dates can be modified
@SpringBootApplication
public class NoteAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoteAppApplication.class, args);
    }
}
