package com.military;

import com.military.model.*;
import com.military.repo.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner init(BaseRepository baseRepo, AssetRepository assetRepo, UserRepository userRepo,
                           PurchaseRepository purchaseRepo){
        return args -> {
            Base b1 = new Base(); b1.setName("Base Alpha"); b1.setLocation("Sector 1");
            Base b2 = new Base(); b2.setName("Base Bravo"); b2.setLocation("Sector 2");
            baseRepo.save(b1); baseRepo.save(b2);

            Asset a1 = new Asset(); a1.setName("Rifle"); a1.setType("Weapon"); a1.setUnit("pcs");
            Asset a2 = new Asset(); a2.setName("Jeep"); a2.setType("Vehicle"); a2.setUnit("pcs");
            assetRepo.save(a1); assetRepo.save(a2);

            AppUser admin = new AppUser(); admin.setUsername("admin"); admin.setPassword("admin123"); admin.setRole("ADMIN");
            AppUser commander = new AppUser(); commander.setUsername("commander"); commander.setPassword("cmd123"); commander.setRole("BASE_COMMANDER");
            AppUser logi = new AppUser(); logi.setUsername("logi"); logi.setPassword("logi123"); logi.setRole("LOGISTICS");
            userRepo.save(admin); userRepo.save(commander); userRepo.save(logi);

            Purchase p = new Purchase(); p.setBase(b1); p.setAsset(a1); p.setQuantity(50); p.setPurchaseDate(LocalDateTime.now());
            purchaseRepo.save(p);
        };
    }
}
