package com.tabula;

import com.tabula.announcement.model.AnnouncementEntity;
import com.tabula.repository.AnnouncementRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@AllArgsConstructor
@Component
public class init implements CommandLineRunner {

    private final AnnouncementRepository announcementRepository;

    @Override
    public void run(String... args) throws Exception {
        if (announcementRepository.count()==0){
            AnnouncementEntity entity=new AnnouncementEntity();
            entity.setTitle("Hello, Softuni!");
            entity.setDescription("Welcome to the Spring Advanced");
            entity.setCreatedOn(Instant.now());
            entity.setUpdatedOn(Instant.now());

            announcementRepository.save(entity);
        }
    }
}
