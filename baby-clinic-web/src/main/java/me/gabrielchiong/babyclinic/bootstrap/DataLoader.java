package me.gabrielchiong.babyclinic.bootstrap;

import me.gabrielchiong.babyclinic.models.Doctor;
import me.gabrielchiong.babyclinic.models.PrimaryParent;
import me.gabrielchiong.babyclinic.services.DoctorService;
import me.gabrielchiong.babyclinic.services.PrimaryParentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final PrimaryParentService primaryParentService;
    private final DoctorService doctorService;

    public DataLoader(PrimaryParentService primaryParentService, DoctorService doctorService) {
        this.primaryParentService = primaryParentService;
        this.doctorService = doctorService;
    }

    @Override
    public void run(String... args) throws Exception {
        PrimaryParent primaryParent1 = new PrimaryParent();
        primaryParent1.setFirstName("Michael");
        primaryParent1.setLastName("Weston");
        primaryParentService.save(primaryParent1);

        PrimaryParent primaryParent2 = new PrimaryParent();
        primaryParent2.setFirstName("Fiona");
        primaryParent2.setLastName("Glenanne");
        primaryParentService.save(primaryParent2);

        System.out.println("Loaded Primary Parents...");

        Doctor doctor1 = new Doctor();
        doctor1.setFirstName("Sam");
        doctor1.setLastName("Axe");
        doctorService.save(doctor1);

        Doctor doctor2 = new Doctor();
        doctor2.setFirstName("Jessie");
        doctor2.setLastName("Porter");
        doctorService.save(doctor2);

        System.out.println("Loaded Doctors...");
    }
}
