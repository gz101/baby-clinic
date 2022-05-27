package me.gabrielchiong.babyclinic.services;

import me.gabrielchiong.babyclinic.models.Doctor;

import java.util.Set;

public interface DoctorService {
    Doctor findById(Long id);

    Doctor save(Doctor doctor);

    Set<Doctor> findAll();
}
